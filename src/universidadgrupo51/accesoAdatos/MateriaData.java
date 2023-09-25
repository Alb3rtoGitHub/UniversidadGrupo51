package universidadgrupo51.accesoAdatos;

import universidadgrupo51.entidades.Materia;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MateriaData {

    private Connection con = null;

    public MateriaData() {

        con = Conexion.getConexion();
    }

    public void guardarMateria(Materia materia) {

        String sql = "INSERT INTO materia(nombre, anio, estado) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia Guardada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido acceder a la tabla de Materia");
        }
    }

    public void modificarMateria(Materia materia) {

        String sql = "UPDATE materia SET nombre = ?, anio = ? WHERE idMateria = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setInt(3, materia.getIdMateria());
            int exito = ps.executeUpdate();
            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Materia Modificada");

            }else{
                JOptionPane.showMessageDialog(null, "La materia no existe");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido acceder a la tabla de Materia");
        }
    }

    public void eliminarMateria(int id) {
        // Consulta que elimina logicamente la materia pero sin tener en cuenta si existe una inscripción
        //String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ?";
        
        //Consulta que no elimina si existe una inscripcion asociada a la materia
        String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ? AND idMateria NOT IN (SELECT idMateria FROM inscripcion WHERE idMateria = ?)";
        
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar la materia con código "+ id +"?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
           try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id); 
            ps.setInt(2, id);
            //exito devuelve la cantidad de filas afectadas. Sie es 1 es por que se elimino. si es 0 es por que no se realizo ningun cambio.
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Materia Eliminada");
            }
            else if(exito==0){
                JOptionPane.showMessageDialog(null, "No se pudo eliminar la materia. Para eliminar una materia no debe tener una inscripción asociada.");
            }
            ps.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se ha podido acceder a la tabla de Materia");
            } 
        }
    }

    public Materia buscarMateria(int id) {
        Materia materia = null;
        String sql = "SELECT nombre, anio, estado FROM materia WHERE idMateria = ? AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido acceder a la tabla de Materia");
        }
        return materia;
    }

    public List<Materia> listarMateria() {
        ArrayList<Materia> ListaMateria = new ArrayList<>();
        String sql = "SELECT idMateria, nombre, anio FROM materia WHERE estado = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();

            while(resultado.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(resultado.getInt("idMateria"));
                materia.setNombre(resultado.getString("nombre"));
                materia.setAnio(resultado.getInt("anio"));
                materia.setEstado(true);
                
                ListaMateria.add(materia);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido acceder a la tabla de Materia");
        }
        
        return ListaMateria;
    }
}
