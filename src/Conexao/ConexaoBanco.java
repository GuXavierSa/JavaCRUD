/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudo
 */
public class ConexaoBanco {
    
    
    private static String url = "jdbc:mysql://localhost:3306/bancojava";
    private static String login = "root";
    private static String  senha = "banco123@";
    
    private static Connection conn;
    
    public static Connection conecta (){
    
        try {
            if(conn == null){
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, login, senha);
                return conn;
                
            }else{
                return conn;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco");
            e.printStackTrace();
            return null;
        }
    
    }
            
    
}
