package modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author MPZ conexcion Base de Datos
 */
public class conexionSQLite {

    /**
     * La variable (cn), es un objeto de la clase Connection.
     */
    Connection cn = null;

    /**
     * Metodo que crea la conexion a la Bases de Datos
     *
     * @return cn
     */
    public Connection conectar() {
        try {
            Class.forName("org.sqlite.JDBC");
            cn = DriverManager.getConnection("jdbc:sqlite:contactos.db");
            System.out.println("exito al conectarse!");

        } catch (ClassNotFoundException | SQLException sqlex) {
            System.out.println("Error al  conectar a la base de Datos: " + sqlex);
        }
        return cn;
    }
}
