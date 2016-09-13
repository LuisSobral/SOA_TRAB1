/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.soa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author luisb
 */
@WebService(serviceName = "ServicoApp")
public class ServicoApp {

    @WebMethod(operationName = "listarPublicacoes")
    public List<AutorPublicacao> listarPublicacoes (@WebParam(name = "titulo") String titulo) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        AutorPublicacaoDAO dao = new AutorPublicacaoDAO();
        
        return dao.consultaTitulo(titulo);
    }
    
    @WebMethod(operationName = "inserirPublicacao")
    public boolean inserirPublicacao(@WebParam(name = "titulo") String titulo, @WebParam(name = "paginaInicial") int paginaInicial, @WebParam(name = "paginaFinal") int paginaFinal, @WebParam(name = "dataPublicacao") String dataPublicacao) throws ClassNotFoundException, InstantiationException, IllegalAccessException, ParseException {
        
        PublicacaoDAO dao = new PublicacaoDAO();
        Publicacao publicacao = new Publicacao();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try {
            
            publicacao.setTitulo(titulo);
            publicacao.setPaginaInicial(paginaInicial);
            publicacao.setPaginaFinal(paginaFinal);
            publicacao.setDataPublicao(formato.parse(dataPublicacao));
            dao.insere(publicacao);
            return true;
        }
        
        catch (Exception e) {
            return false;
        }
    }
    
    @WebMethod(operationName = "atualizarPublicacao")
    public boolean atualizarPublicacao(@WebParam(name = "id") int id, @WebParam(name = "titulo") String titulo, @WebParam(name = "paginaInicial") int paginaInicial, @WebParam(name = "paginaFinal") int paginaFinal, @WebParam(name = "dataPublicacao") String dataPublicacao) throws ClassNotFoundException, InstantiationException, IllegalAccessException, ParseException {
        
        PublicacaoDAO dao = new PublicacaoDAO();
        Publicacao publicacao = new Publicacao();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try {
            
            publicacao.setId(id);
            publicacao.setTitulo(titulo);
            publicacao.setPaginaInicial(paginaInicial);
            publicacao.setPaginaFinal(paginaFinal);
            publicacao.setDataPublicao(formato.parse(dataPublicacao));
            dao.atualiza(publicacao);
            return true;
        }
        
        catch (Exception e) {
            return false;
        }
    }
    
    @WebMethod(operationName = "deletarPublicacao")
    public boolean deletarPublicacao(@WebParam(name = "id") int id) throws ClassNotFoundException, InstantiationException, IllegalAccessException, ParseException {
        
        PublicacaoDAO dao = new PublicacaoDAO();
        Publicacao publicacao = new Publicacao();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try {
            
            publicacao.setId(id);
            dao.deleta(publicacao);
            return true;
        }
        
        catch (Exception e) {
            return false;
        }
    }
}
