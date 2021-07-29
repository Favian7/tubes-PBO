package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Dina Yuliana
 */
public class formKoneksi {
   static Connection con;
   public static Connection getConnection() {
       
        try {
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/juragansapi","root","");
            System.out.println("Koneksi Berhasil");
        }catch (Exception e) {
         JOptionPane.showMessageDialog(null, "ERROR : Koneksi Gagal!");
         System.exit(0);
     }
       return con;
   }  
}

