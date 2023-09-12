
package universidadgrupo51.accesoAdatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadgrupo51.entidades.Alumno;
import universidadgrupo51.entidades.Inscripcion;
import universidadgrupo51.entidades.Materia;

public class InscripcionData {
    private Connection con = null;
    private MateriaData matData;
    private AlumnoData aluData;
    
    public InscripcionData() {
        con = Conexion.getConexion();
    }
    
    public void guardarInscripcion(Inscripcion inscripcion){
        String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) VALUES (null, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inscripcion.getAlumno().getIdAlumno());
            ps.setInt(2, inscripcion.getMateria().getIdMateria());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()) {
                inscripcion.setIdInscripto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripción exitosa");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion " + ex.getMessage());
        }
    }
    
    public List<Inscripcion> obtenerInscripciones(){
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();
        aluData = new AlumnoData();
        matData = new MateriaData();
        
        String sql = "SELECT * FROM inscripcion";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery(); 
            
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripto(rs.getInt("idInscripto"));
                inscripcion.setNota(rs.getDouble("nota"));
                inscripcion.setAlumno(aluData.buscarAlumno(rs.getInt("idAlumno")));
                inscripcion.setMateria(matData.buscarMateria(rs.getInt("idMateria")));
                inscripciones.add(inscripcion);
            }
            if (inscripciones.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No existen datos de Inscripciones ");
            }
            ps.close();
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Inscripción " + ex.getMessage());
        }
        return inscripciones;        
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();
        aluData = new AlumnoData();
        matData = new MateriaData();
        
        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?;";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery(); 
            
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripto(rs.getInt("idInscripto"));
                inscripcion.setNota(rs.getDouble("nota"));
                inscripcion.setAlumno(aluData.buscarAlumno(rs.getInt("idAlumno")));
                inscripcion.setMateria(matData.buscarMateria(rs.getInt("idMateria")));
                inscripciones.add(inscripcion);
            }
            if (inscripciones.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No existen datos para ese idAlumno ");
            }
            ps.close();
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Inscripción " + ex.getMessage());
        }
        return inscripciones;        
    }
    
    public List<Materia> obtenerMateriasCursadas(int id) {
        ArrayList<Materia> materias = new ArrayList<>();
        
        String sql = "SELECT i.idMateria, nombre, anio FROM inscripcion i JOIN "
                + " materia m ON(i.idMateria = m.idMateria) WHERE"
                + " i.idAlumno = ?;";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            
            Materia materia;
            
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones " + ex.getMessage());
        }
        return materias;
    }

    public List<Materia> obtenerMateriasNoCursadas(int id) {
        ArrayList<Materia> materias = new ArrayList<>();
        
        //Investigue al menos dos formas de hacer esta consulta:
//        String sql = "SELECT m.idMateria, m.nombre, m.anio FROM materia m LEFT JOIN inscripcion i "
//                + "ON(m.idMateria = i.idMateria) AND i.idAlumno = 1 WHERE i.idMateria IS NULL AND m.estado = 1 ;";
        String sql = "SELECT idMateria, nombre, anio FROM materia WHERE idMateria NOT IN "
                + "(SELECT idMateria FROM inscripcion WHERE inscripcion.idAlumno = ?) AND materia.estado = 1;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            
            Materia materia;
            
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones " + ex.getMessage());
        }
        return materias;
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?;";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            
            int fila = ps.executeUpdate();
            
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se borró la Inscripción del Alumno en la Materia");
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Inscripción " + ex.getMessage());
        }
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?;";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
                        
            int exito = ps.executeUpdate();
            
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Nota modificada exitosamente");
            } else{
                JOptionPane.showMessageDialog(null, "Los datos de la Nota no existen");
            }
            ps.close();
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Inscripción " + ex.getMessage());
        }
    }
    
    public List<Alumno> obtenerAlumnosXMateria(int idMateria) {
        ArrayList<Alumno> alumnos = new ArrayList<>();

        String sql = "SELECT a.idAlumno, a.dni, a.apellido, a.nombre, a.fechaNacimiento FROM inscripcion i "
                + "JOIN alumno a ON(i.idAlumno = a.idAlumno) JOIN materia m ON(i.idMateria = m.idMateria) "
                + "WHERE i.idMateria = ?;";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            
            ResultSet rs = ps.executeQuery(); 
            
            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate()); // convierto fecha de Data a LocalDate
                alumno.setEstado(true);
                alumnos.add(alumno);
            }
            if (alumnos.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No existen datos para ese idMateria ");
            }
            ps.close();
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la Tabla Alumno " + ex.getMessage());
        }
        return alumnos;
    }
}
