/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.soa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisb
 */
public class ListaPublicacoes {
    
    private List<Publicacao> publicacoes = new ArrayList<>();

    public List<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(List<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }
    
    public void adicionaPublicacao(Publicacao publicacao) {
        publicacoes.add(publicacao);
    }
    
    public Iterable<Publicacao> pegaPublicacoes() {
        return publicacoes;
    }
    
    public void preenchePublicacoes() {
       
        try {
            Publicacao publicacao = new Publicacao();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

            publicacao.setId(1);
            publicacao.setTitulo("ResearchOps: The case for DevOps in scientific applications");
            publicacao.setPaginaInicial(1398);
            publicacao.setPaginaFinal(1404);
            publicacao.setDataPublicao(formato.parse("11/05/2015"));
            adicionaPublicacao(publicacao);
            
            Publicacao publicacao2 = new Publicacao();

            publicacao2.setId(2);
            publicacao2.setTitulo("Architecting Cloud Tools using Software Product Line Techniques: an Exploratory Study");
            publicacao2.setPaginaInicial(1441);
            publicacao2.setPaginaFinal(1448);
            publicacao2.setDataPublicao(formato.parse("15/04/2015"));
            adicionaPublicacao(publicacao2);
            
        } catch (ParseException ex) {
            System.out.println("Erro: " +ex);
        }
    }
}
