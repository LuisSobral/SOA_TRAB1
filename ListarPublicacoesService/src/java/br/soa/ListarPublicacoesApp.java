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
@WebService(serviceName = "ListarPublicacoesApp")
public class ListarPublicacoesApp {

    @WebMethod(operationName = "listarPublicacoes")
    public List<Publicacao> listarPublicacoes (@WebParam(name = "titulo") String titulo) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        PublicacaoDAO dao = new PublicacaoDAO();
        ListaPublicacoes publicacoesAchadas = dao.consultaTitulo(titulo);
        
        return publicacoesAchadas.pegaPublicacoes();
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
}
