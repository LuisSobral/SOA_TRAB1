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
import br.soa.Publicacao;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author luisb
 */
public class Cliente {

    public static void main(String[] args) throws InstantiationException_Exception, ClassNotFoundException_Exception, IllegalAccessException_Exception, ParseException_Exception {
        
        inserePublicacao();
        
        List<Publicacao> publicacoes = listarPublicacoes("Architecting Cloud Tools using Software Product Line Techniques: an Exploratory Study");
        
        for (Publicacao publicacao : publicacoes) {
            System.out.println("Id: " +publicacao.getId());
            System.out.println("Titulo: " +publicacao.getTitulo());
            System.out.println("Pagina Inicial: " +publicacao.getPaginaInicial());
            System.out.println("Pagina Final: " +publicacao.getPaginaFinal());
            System.out.println("Data: " +publicacao.getDataPublicao().getDay()+"/"+publicacao.getDataPublicao().getMonth()+"/"+publicacao.getDataPublicao().getYear());
        }
    }

    private static java.util.List<br.soa.Publicacao> listarPublicacoes(java.lang.String titulo) throws InstantiationException_Exception, ClassNotFoundException_Exception, IllegalAccessException_Exception {
        br.soa.ListarPublicacoesApp_Service service = new br.soa.ListarPublicacoesApp_Service();
        br.soa.ListarPublicacoesApp port = service.getListarPublicacoesAppPort();
        return port.listarPublicacoes(titulo);
    }

    private static boolean inserirPublicacao(java.lang.String titulo, int paginaInicial, int paginaFinal, java.lang.String dataPublicacao) throws IllegalAccessException_Exception, ParseException_Exception, InstantiationException_Exception, ClassNotFoundException_Exception {
        br.soa.ListarPublicacoesApp_Service service = new br.soa.ListarPublicacoesApp_Service();
        br.soa.ListarPublicacoesApp port = service.getListarPublicacoesAppPort();
        return port.inserirPublicacao(titulo, paginaInicial, paginaFinal, dataPublicacao);
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
    
}
