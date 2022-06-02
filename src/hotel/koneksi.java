/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ara
 */
public class koneksi {
    public static Connection con;
    public static String TAG = "koneksi";
    public static Connection getCon() {
        try {
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "");
             System.out.println(TAG+": sudah connect");
        } catch (Exception e) {
           // e.printStackTrace();
            JOptionPane.showMessageDialog(null, e, "pesan kesalahan", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
    
}
