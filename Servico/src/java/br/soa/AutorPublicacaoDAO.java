/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.soa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisb
 */
public class AutorPublicacaoDAO {
    
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
    
    
    public List<AutorPublicacao> consultaTitulo(String titulo) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        List<AutorPublicacao> autoresPublicacoes = new ArrayList<>();
        
        try{
            abrirConexao();
            
            String sql = "select p.id as idPublicacao, titulo, paginaInicial, paginaFinal, dataPublicacao, id_pub, id_autor, au.id as idAutor, nome, nomeCitacao, cpf " +
                            "from publicacao as p INNER JOIN autoria as aut ON p.id = aut.id_pub INNER JOIN autor as au ON au.id = aut.id_autor where titulo = ?";            
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, titulo);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                AutorPublicacao autorPublicacao = new AutorPublicacao();
                
                autorPublicacao.setId_pub(rs.getInt("idPublicacao"));
                autorPublicacao.setTitulo(rs.getString("titulo"));
                autorPublicacao.setPaginaInicial(rs.getInt("paginaInicial"));
                autorPublicacao.setPaginaFinal(rs.getInt("paginaFinal"));
                autorPublicacao.setDataPublicao(rs.getTimestamp("dataPublicacao"));
                autorPublicacao.setId_autor(rs.getInt("idAutor"));
                autorPublicacao.setNome(rs.getString("nome"));
                autorPublicacao.setNomeCitacao(rs.getString("nomeCitacao"));
                autorPublicacao.setCpf(rs.getString("cpf"));
                autoresPublicacoes.add(autorPublicacao);
            }
        }
        
        catch(Exception e) {
        }
        
        return autoresPublicacoes;
    }
    
}
