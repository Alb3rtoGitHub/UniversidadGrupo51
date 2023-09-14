
package universidadgrupo51.accesoAdatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadgrupo51.entidades.Alumno;


public class AlumnoData {
    private Connection con=null;
    
    public AlumnoData(){
    con=Conexion.getConexion();
    }
    
    public void guardarAlumno(Alumno alumno){
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado)"+
                "VALUE (?,?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno Agregado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Alumno " + ex.getMessage());
        }
    }
    
    public void modificarAlumno(Alumno alumno){
        String sql = "UPDATE alumno SET dni = ?, apellido = ?, nombre = ?, fechaNacimiento = ?"
                + "WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setInt(5, alumno.getIdAlumno());
            int exito = ps.executeUpdate();
            if (exito == 1){
                JOptionPane.showMessageDialog(null, "El Alumno se modifico.");
            }else{
                JOptionPane.showMessageDialog(null, "El Alumno no existe");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Alumno " + ex.getMessage());
        }
    }
    
    public void eliminarAlumno(int id){
        int opcion = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar el Alumno?", "Confirmar Borrar Alumno", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno=?";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                int exito = ps.executeUpdate();
                if (exito == 1){
                    JOptionPane.showMessageDialog(null, "El Alumno se elimino.");
                }
                ps.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a tabla Alumno " + ex.getMessage());
            }
        }
    }
    
    public Alumno buscarAlumno(int id){
        String sql = "SELECT dni, apellido, nombre, fechaNacimiento From alumno WHERE idAlumno = ? AND estado = 1";
        Alumno alumno = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);
            }else{
                JOptionPane.showMessageDialog(null, "No existe ese Alumno");
            }
            ps.close();
                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Alumno " + ex.getMessage());
        }
       
        return alumno;
    }
    
        public Alumno buscarAlumnoPorDNI(int dni){
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento From alumno WHERE dni = ? AND estado = 1";
        Alumno alumno = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);
            }else{
                JOptionPane.showMessageDialog(null, "No existe ese Alumno");
            }
            ps.close();
                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Alumno " + ex.getMessage());
        }
       
        return alumno;
    }
        
    public List<Alumno> listarAlumnos(){
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento From alumno WHERE estado = 1";
        ArrayList<Alumno> alumnos = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);
                
                alumnos.add(alumno);
            }
            ps.close();
                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Alumno " + ex.getMessage());
        }
       
        return alumnos;
    }
}