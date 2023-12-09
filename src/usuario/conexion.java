/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuario;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author melis
 */
public class conexion {
    Connection conectar=null;
    public  Connection conectar(){
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/javasql", "root", "Manzana2988.,");
           JOptionPane.showMessageDialog(null, "Conexion exitosa", "Conexion", JOptionPane.INFORMATION_MESSAGE);
           
       }catch(ClassNotFoundException | SQLException e){
           JOptionPane.showMessageDialog(null, "Sin conexion"+e, "Conexion", JOptionPane.ERROR_MESSAGE);
           
       }
   return conectar; 
}
    public static void main(String[] args) {
        
    }
}
