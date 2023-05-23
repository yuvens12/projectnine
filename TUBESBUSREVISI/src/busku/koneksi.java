package busku;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {

    public static Connection konek() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection konekDB = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus", "root", "123456");
            return konekDB;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
