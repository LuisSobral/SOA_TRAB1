/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.soa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisb
 */
public class ListaPublicacoes {
    
    private List<Publicacao> publicacoes = new ArrayList<>();

    public List<Publicacao> pegaPublicacoes() {
        return publicacoes;
    }
    
    public void adicionaPublicacao(Publicacao publicacao) {
        publicacoes.add(publicacao);
    }
}
