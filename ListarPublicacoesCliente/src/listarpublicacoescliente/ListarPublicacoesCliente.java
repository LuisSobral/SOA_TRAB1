/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listarpublicacoescliente;

import br.soa.Publicacao;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

/**
 *
 * @author luisb
 */
public class ListarPublicacoesCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       List<Publicacao> publicacoes = listarPublicacoes("Architecting Cloud Tools using Software Product Line Techniques: an Exploratory Study");
        
        for (Publicacao publicacao : publicacoes) {
            System.out.println("Id: " +publicacao.getId());
            System.out.println("Titulo: " +publicacao.getTitulo());
            System.out.println("Pagina Inicial: " +publicacao.getPaginaInicial());
            System.out.println("Pagina Final: " +publicacao.getPaginaFinal());
            System.out.println("Data: " +publicacao.getDataPublicao().getDay()+"/"+publicacao.getDataPublicao().getMonth()+"/"+publicacao.getDataPublicao().getYear());
        }
        
    }

    private static List<Publicacao> listarPublicacoes(java.lang.String titulo) {
        
        br.soa.ListarPublicacoesApp_Service service = new br.soa.ListarPublicacoesApp_Service();
        br.soa.ListarPublicacoesApp port = service.getListarPublicacoesAppPort();
        return port.listarPublicacoes(titulo);
    }
    
}
