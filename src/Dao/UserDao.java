/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Conexao.ConexaoBanco;
import Models.User;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;



/**
 *
 * @author Estudo
 */
public class UserDao {
     
    
    public void cadastraUser(User usuario) {
    
        String sql = "INSERT INTO user (nome, email, senha, dia, mes, ano) VALUES (?,?,?,?,?,?)";
    
        PreparedStatement ps = null;
        
        try {
            
            ps = ConexaoBanco.conecta().prepareStatement(sql);
            
            ps.setString(1, usuario.getNome());
            System.out.println("nome ok");
            ps.setString(2, usuario.getEmail());
            System.out.println("email ok");
            ps.setString(3, usuario.getSenha());
            System.out.println("sehna ok");
            ps.setInt(4, usuario.getDia());
            System.out.println("dia ok");
            ps.setString(5, usuario.getMes());
            System.out.println("mes ok");
            ps.setInt(6, usuario.getAno());
            System.out.println("ano ok");
            
            ps.execute();
            ps.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com a DAO");
            e.printStackTrace();
        }
        
}
}
