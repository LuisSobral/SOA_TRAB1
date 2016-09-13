/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import br.soa.ClassNotFoundException_Exception;
import br.soa.IllegalAccessException_Exception;
import br.soa.InstantiationException_Exception;
import br.soa.ParseException_Exception;
import br.soa.AutorPublicacao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author luisb
 */
public class Cliente {

    public static void main(String[] args) throws InstantiationException_Exception, ClassNotFoundException_Exception, IllegalAccessException_Exception, ParseException_Exception {
        
        int escolha = menu();
        
        while(escolha != 0) {
            switch (escolha) {
                case 1:
                    inserePublicacao();
                    break;
                case 2:
                    atualizaPublicacao();
                    break;
                case 3: 
                    deletaPublicacao();
                    break;
                case 4:
                    listaInformacoes();
                    break;
                default:
                    break;
            }
            
            escolha = menu();
        }
    }
    
    private static List<AutorPublicacao> listarPublicacoes(java.lang.String titulo) throws IllegalAccessException_Exception, InstantiationException_Exception, ClassNotFoundException_Exception {
        br.soa.ServicoApp_Service service = new br.soa.ServicoApp_Service();
        br.soa.ServicoApp port = service.getServicoAppPort();
        return port.listarPublicacoes(titulo);
    }
    
    private static boolean inserirPublicacao(java.lang.String titulo, int paginaInicial, int paginaFinal, java.lang.String dataPublicacao) throws IllegalAccessException_Exception, ParseException_Exception, InstantiationException_Exception, ClassNotFoundException_Exception {
        br.soa.ServicoApp_Service service = new br.soa.ServicoApp_Service();
        br.soa.ServicoApp port = service.getServicoAppPort();
        return port.inserirPublicacao(titulo, paginaInicial, paginaFinal, dataPublicacao);
    }
    
    
    private static boolean atualizarPublicacao(int id, java.lang.String titulo, int paginaInicial, int paginaFinal, java.lang.String dataPublicacao) throws IllegalAccessException_Exception, ParseException_Exception, ClassNotFoundException_Exception, InstantiationException_Exception {
        br.soa.ServicoApp_Service service = new br.soa.ServicoApp_Service();
        br.soa.ServicoApp port = service.getServicoAppPort();
        return port.atualizarPublicacao(id, titulo, paginaInicial, paginaFinal, dataPublicacao);
    }

    private static boolean deletarPublicacao(int id) throws InstantiationException_Exception, IllegalAccessException_Exception, ClassNotFoundException_Exception, ParseException_Exception {
        br.soa.ServicoApp_Service service = new br.soa.ServicoApp_Service();
        br.soa.ServicoApp port = service.getServicoAppPort();
        return port.deletarPublicacao(id);
    }

    private static void inserePublicacao() throws IllegalAccessException_Exception, ParseException_Exception, InstantiationException_Exception, ClassNotFoundException_Exception {
        
        Scanner ler = new Scanner(System.in);
        String titulo, dataPublicacao;
        int paginaInicial, paginaFinal;
        
        System.out.print("Nome da publicacao: ");
        titulo = ler.nextLine();
        System.out.print("Pagina Inicial da Publicacao: ");
        paginaInicial = ler.nextInt();
        System.out.print("Pagina Final da Publicacao: ");
        paginaFinal = ler.nextInt();
        System.out.print("Data da Publicacao: ");
        dataPublicacao = ler.next();
        
        if(inserirPublicacao(titulo,paginaInicial, paginaFinal, dataPublicacao))
            System.out.println("Publicacao inserida.");
        
        else
            System.out.println("Erro ao inserir publicacao");
    }
    
    private static void atualizaPublicacao() throws IllegalAccessException_Exception, ParseException_Exception, InstantiationException_Exception, ClassNotFoundException_Exception {
        
        Scanner ler = new Scanner(System.in);
        String titulo, dataPublicacao;
        int paginaInicial, paginaFinal, id;
        
        System.out.print("Id da Publicacao a ser atualizada: ");
        id = ler.nextInt();
        System.out.print("Nome da publicacao: ");
        titulo = ler.nextLine();
        System.out.print("Pagina Inicial da Publicacao: ");
        paginaInicial = ler.nextInt();
        System.out.print("Pagina Final da Publicacao: ");
        paginaFinal = ler.nextInt();
        System.out.print("Data da Publicacao: ");
        dataPublicacao = ler.next();
        
        if(atualizarPublicacao(id,titulo,paginaInicial, paginaFinal, dataPublicacao))
            System.out.println("Publicacao atualizacao.");
        
        else
            System.out.println("Erro ao atualizar publicacao");
    }
    
    private static void deletaPublicacao() throws InstantiationException_Exception, IllegalAccessException_Exception, ClassNotFoundException_Exception, ParseException_Exception {
        
        Scanner ler = new Scanner(System.in);
        int id;
          
        System.out.print("Id da publicacao a ser deletada: ");
        id = ler.nextInt();
        
        if(deletarPublicacao(id))
            System.out.println("Publicacao deletada.");
        
        else
            System.out.println("Erro ao deletar publicacao");
    }
    
    private static void listaInformacoes() throws IllegalAccessException_Exception, InstantiationException_Exception, ClassNotFoundException_Exception {
        
        List<AutorPublicacao> autoresPublicacoes = new ArrayList<>();
        
        autoresPublicacoes = listarPublicacoes("ResearchOps: The case for DevOps in scientific applications");
        
        for (AutorPublicacao autorPublicacao : autoresPublicacoes) {
            System.out.println("Id da Publicacao: " +autorPublicacao.getIdPub());
            System.out.println("Titulo: " +autorPublicacao.getTitulo());
            System.out.println("Pagina Inicial: " +autorPublicacao.getPaginaInicial());
            System.out.println("Pagina Final: " +autorPublicacao.getPaginaFinal());
            System.out.println("Data: " +autorPublicacao.getDataPublicao().getDay()+"/"+autorPublicacao.getDataPublicao().getMonth()+"/"+autorPublicacao.getDataPublicao().getYear());
            System.out.println("Id do Autor: " +autorPublicacao.getIdAutor());
            System.out.println("Nome: " +autorPublicacao.getNome());
            System.out.println("Nome Citacao: " +autorPublicacao.getNomeCitacao());
            System.out.println("CPF: " +autorPublicacao.getCpf());
        }
    }

    private static int menu() {
        
         Scanner ler = new Scanner(System.in);
         int escolha;
         
         System.out.print("Digite a opcao que deseja: ");
         escolha = ler.nextInt();
         
         return escolha;
    }
}
