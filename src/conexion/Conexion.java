package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    // Ajusta estos valores si cambian
    private static final String URL  = "jdbc:mysql://localhost:3306/bd_sistemas_ventas";
    private static final String USER = "root";
    private static final String PASS = ""; // contraseña vacía

  public static Connection conectar() {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASS);
    } catch (Exception e) {
        System.out.println("Error en la conexión local: " + e);
        return null;
    }
}

}
