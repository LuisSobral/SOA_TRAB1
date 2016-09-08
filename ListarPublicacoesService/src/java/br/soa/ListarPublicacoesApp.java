/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.soa;

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
    public List<Publicacao> listarPublicacoes (@WebParam(name = "titulo") String titulo) {
        
        ListaPublicacoes publicacoes = new ListaPublicacoes();
        publicacoes.preenchePublicacoes();
        ListaPublicacoes publicacoesAchadas = new ListaPublicacoes();
        
        for (Publicacao publicacao : publicacoes.pegaPublicacoes()) {
            if(publicacao.getTitulo().compareToIgnoreCase(titulo) == 0) {
                publicacoesAchadas.adicionaPublicacao(publicacao);                       
            }
        }
        
        return publicacoesAchadas.getPublicacoes();
    }
}
