/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokobukuapps;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author yogaadipratama
 */

public class Koneksi {
    static Connection koneksi;
    public static Connection getKoneksi(){
        try {
            String url = "jdbc:mysql://localhost/tokoBuku";
            String user = "root";
            String password = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection(url, user, password);
        }
        catch (SQLException t){
            System.out.println("Error Membuat Koneksi");
        }
        return koneksi;
    }
    
    public static void main (String args[]){
        getKoneksi();
    }
}