/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.soa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author luisb
 */
public class AutorDAO {
 
    private Connection con = null;
    
    private void abrirConexao() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soa", "root", "root");
            System.out.println("Conexão aberta");
        }
        
        catch(Exception e) {
            System.out.println("Erro: " +e);
        }
    }
    
    public void atualiza(Autor autor) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        try{
            abrirConexao();
            
            String sql = "UPTADE autor SET nome = ?, nomeCitacao = ?, cpf = ? WHERE id = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, autor.getNome());
            ps.setString(2, autor.getNomeCitacao());
            ps.setString(3, autor.getCpf());
            ps.setInt(4, autor.getId());
            ps.executeUpdate();
        }
        
        catch(Exception e) {
            System.out.println("Erro: " +e);
        }
    }
    
    public void insere(Autor autor) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        try{
            abrirConexao();
            
            String sql = "INSERT INTO autor (nome,nomeCitacao,cpf) VALUES (?,?,?)";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, autor.getNome());
            ps.setString(2, autor.getNomeCitacao());
            ps.setString(3, autor.getCpf());
            ps.executeUpdate();
        }
        
        catch(Exception e) {
            System.out.println("Erro: " +e);
        }
    }
    
    public void deleta(Autor autor) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        try{
            abrirConexao();
            
            String sql = "DELETE FROM autor WHERE id = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, autor.getId());
            ps.executeUpdate();
        }
        
        catch(Exception e) {
            System.out.println("Erro: " +e);
        }
    }
    
}
