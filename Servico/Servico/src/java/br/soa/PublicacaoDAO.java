/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.soa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

/**
 *
 * @author luisb
 */
public class PublicacaoDAO {
    
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
    
    public void atualiza(Publicacao publicacao) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        try{
            abrirConexao();
            
            String sql = "UPTADE publicacao SET titulo = ?, paginaInicial = ?, paginaFinal = ?, dataPublicacao = ? WHERE id = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, publicacao.getTitulo());
            ps.setInt(2, publicacao.getPaginaInicial());
            ps.setInt(3, publicacao.getPaginaFinal());
            ps.setTimestamp(4, new Timestamp (publicacao.getDataPublicao().getTime()));
            ps.setInt(5, publicacao.getId());
            ps.executeUpdate();
        }
        
        catch(Exception e) {
            System.out.println("Erro: " +e);
        }
    }
    
    public void insere(Publicacao publicacao) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        try{
            abrirConexao();
            
            String sql = "INSERT INTO publicacao (titulo,paginaInicial,paginaFinal,dataPublicacao) VALUES (?,?,?,?)";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, publicacao.getTitulo());
            ps.setInt(2, publicacao.getPaginaInicial());
            ps.setInt(3, publicacao.getPaginaFinal());
            ps.setTimestamp(4, new Timestamp (publicacao.getDataPublicao().getTime()));
            ps.executeUpdate();
        }
        
        catch(Exception e) {
            System.out.println("Erro: " +e);
        }
    }
    
    public void deleta(Publicacao publicacao) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        try{
            abrirConexao();
            
            String sql = "DELETE FROM publicacao WHERE id = ?";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, publicacao.getId());
            ps.executeUpdate();
        }
        
        catch(Exception e) {
            System.out.println("Erro: " +e);
        }
    }
}
