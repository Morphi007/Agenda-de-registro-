package modelo;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

/**
 * EstudiantesDTS
 *
 * @author MPZ
 */
public class EstudiantesDTS {

    conexionSQLite conectar = new conexionSQLite();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    /**
     * Este metodo se encarga de registrar un los nuevos estudiantes
     *
     * @param c
     * @return 1
     */
    public int agregar(Estudiante c) {

        String sql = "insert into tbl_estudiante (Nombres, Apellidos, Matricula, Correo,Materia) values (?,?,?,?,?)";

        try {

            con = conectar.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getNombres());
            ps.setString(2, c.getApellidos());
            ps.setString(3, c.getMatricula());
            ps.setString(4, c.getCorreo());
            ps.setString(5, c.getMateria());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al tratar de insertar datos: " + e);
        }
        return 1;
    }

    /**
     * Buscar Este metodo se encarga de listar un registro, y trae un objeto
     * tipo arrayList.
     *
     * @param valorBuscar
     * @return datos
     */
    public List listarRegistro(String valorBuscar) {

        String sql = "select * from tbl_estudiante "
                + "where id||Nombres||Apellidos||Matricula||Correo||Materia like '%" + valorBuscar + "%'";

        List<Estudiante> datos = new ArrayList<>();
        try {

            con = conectar.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Estudiante c = new Estudiante();
                c.setId(rs.getInt(1));
                c.setNombres(rs.getString(2));
                c.setApellidos(rs.getString(3));
                c.setMatricula(rs.getString(4));
                c.setCorreo(rs.getString(5));
                c.setMateria(rs.getString(6));
                datos.add(c);
            }
        } catch (SQLException ex) {
            System.out.println("Error al listar los estudiante: " + ex);
        }
        return datos;
    }

    /**
     * Este metodo se encarga de listar los estudiantes registrado
     *
     * @return datos
     */
    public List listar() {
        String sql = "select * from tbl_estudiante";
        List<Estudiante> datos = new ArrayList<>();
        try {

            con = conectar.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Estudiante c = new Estudiante();
                c.setId(rs.getInt(1));
                c.setNombres(rs.getString(2));
                c.setApellidos(rs.getString(3));
                c.setMatricula(rs.getString(4));
                c.setCorreo(rs.getString(5));
                c.setMateria(rs.getString(6));
                datos.add(c);
            }
        } catch (SQLException ex) {
            System.out.println("Error al listar los estudiantes: " + ex);
        }
        return datos;
    }

    /**
     * Este metodo se encarga de actualizar un registro,
     *
     * @param c
     * @return r
     */
    public int actualizar(Estudiante c) {

        int r = 0;

        String sql = "update tbl_estudiante set Nombres=?, Apellidos=?, Matricula=?, Correo=?,Materia=? where ID=?";

        try {
            con = conectar.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getNombres());
            ps.setString(2, c.getApellidos());
            ps.setString(3, c.getMatricula());
            ps.setString(4, c.getCorreo());
            ps.setString(5, c.getMateria());
            ps.setInt(6, c.getId());
            r = ps.executeUpdate();

            if (r == 1) {
                return 1;
            } else {
                return 0;
            }

        } catch (SQLException e) {
            System.out.println("Error al tratar de actualizar datos: " + e);
        }
        return r;
    }

    /**
     * Este metodo se encarga de eliminar el registro seleccionado.
     *
     * @param id
     * @return r
     */
    public int eliminar(int id) {

        int r = 0;

        String sql = "delete from tbl_estudiante where id=" + id;

        try {
            con = conectar.conectar();
            ps = con.prepareStatement(sql);
            r = ps.executeUpdate();
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException e) {
            System.out.println("Error al tratar de borrar datos: " + e);
        }
        return r;
    }
}
