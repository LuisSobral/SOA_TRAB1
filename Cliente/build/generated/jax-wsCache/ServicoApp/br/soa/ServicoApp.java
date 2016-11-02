
package br.soa;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServicoApp", targetNamespace = "http://soa.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicoApp {


    /**
     * 
     * @param paginaFinal
     * @param titulo
     * @param dataPublicacao
     * @param id
     * @param paginaInicial
     * @return
     *     returns boolean
     * @throws ClassNotFoundException_Exception
     * @throws ParseException_Exception
     * @throws IllegalAccessException_Exception
     * @throws InstantiationException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "atualizarPublicacao", targetNamespace = "http://soa.br/", className = "br.soa.AtualizarPublicacao")
    @ResponseWrapper(localName = "atualizarPublicacaoResponse", targetNamespace = "http://soa.br/", className = "br.soa.AtualizarPublicacaoResponse")
    @Action(input = "http://soa.br/ServicoApp/atualizarPublicacaoRequest", output = "http://soa.br/ServicoApp/atualizarPublicacaoResponse", fault = {
        @FaultAction(className = ClassNotFoundException_Exception.class, value = "http://soa.br/ServicoApp/atualizarPublicacao/Fault/ClassNotFoundException"),
        @FaultAction(className = InstantiationException_Exception.class, value = "http://soa.br/ServicoApp/atualizarPublicacao/Fault/InstantiationException"),
        @FaultAction(className = IllegalAccessException_Exception.class, value = "http://soa.br/ServicoApp/atualizarPublicacao/Fault/IllegalAccessException"),
        @FaultAction(className = ParseException_Exception.class, value = "http://soa.br/ServicoApp/atualizarPublicacao/Fault/ParseException")
    })
    public boolean atualizarPublicacao(
        @WebParam(name = "id", targetNamespace = "")
        int id,
        @WebParam(name = "titulo", targetNamespace = "")
        String titulo,
        @WebParam(name = "paginaInicial", targetNamespace = "")
        int paginaInicial,
        @WebParam(name = "paginaFinal", targetNamespace = "")
        int paginaFinal,
        @WebParam(name = "dataPublicacao", targetNamespace = "")
        String dataPublicacao)
        throws ClassNotFoundException_Exception, IllegalAccessException_Exception, InstantiationException_Exception, ParseException_Exception
    ;

    /**
     * 
     * @param id
     * @return
     *     returns boolean
     * @throws ClassNotFoundException_Exception
     * @throws ParseException_Exception
     * @throws IllegalAccessException_Exception
     * @throws InstantiationException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deletarPublicacao", targetNamespace = "http://soa.br/", className = "br.soa.DeletarPublicacao")
    @ResponseWrapper(localName = "deletarPublicacaoResponse", targetNamespace = "http://soa.br/", className = "br.soa.DeletarPublicacaoResponse")
    @Action(input = "http://soa.br/ServicoApp/deletarPublicacaoRequest", output = "http://soa.br/ServicoApp/deletarPublicacaoResponse", fault = {
        @FaultAction(className = ClassNotFoundException_Exception.class, value = "http://soa.br/ServicoApp/deletarPublicacao/Fault/ClassNotFoundException"),
        @FaultAction(className = InstantiationException_Exception.class, value = "http://soa.br/ServicoApp/deletarPublicacao/Fault/InstantiationException"),
        @FaultAction(className = IllegalAccessException_Exception.class, value = "http://soa.br/ServicoApp/deletarPublicacao/Fault/IllegalAccessException"),
        @FaultAction(className = ParseException_Exception.class, value = "http://soa.br/ServicoApp/deletarPublicacao/Fault/ParseException")
    })
    public boolean deletarPublicacao(
        @WebParam(name = "id", targetNamespace = "")
        int id)
        throws ClassNotFoundException_Exception, IllegalAccessException_Exception, InstantiationException_Exception, ParseException_Exception
    ;

    /**
     * 
     * @param titulo
     * @return
     *     returns java.util.List<br.soa.AutorPublicacao>
     * @throws ClassNotFoundException_Exception
     * @throws IllegalAccessException_Exception
     * @throws InstantiationException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarPublicacoes", targetNamespace = "http://soa.br/", className = "br.soa.ListarPublicacoes")
    @ResponseWrapper(localName = "listarPublicacoesResponse", targetNamespace = "http://soa.br/", className = "br.soa.ListarPublicacoesResponse")
    @Action(input = "http://soa.br/ServicoApp/listarPublicacoesRequest", output = "http://soa.br/ServicoApp/listarPublicacoesResponse", fault = {
        @FaultAction(className = ClassNotFoundException_Exception.class, value = "http://soa.br/ServicoApp/listarPublicacoes/Fault/ClassNotFoundException"),
        @FaultAction(className = InstantiationException_Exception.class, value = "http://soa.br/ServicoApp/listarPublicacoes/Fault/InstantiationException"),
        @FaultAction(className = IllegalAccessException_Exception.class, value = "http://soa.br/ServicoApp/listarPublicacoes/Fault/IllegalAccessException")
    })
    public List<AutorPublicacao> listarPublicacoes(
        @WebParam(name = "titulo", targetNamespace = "")
        String titulo)
        throws ClassNotFoundException_Exception, IllegalAccessException_Exception, InstantiationException_Exception
    ;

    /**
     * 
     * @param paginaFinal
     * @param titulo
     * @param dataPublicacao
     * @param paginaInicial
     * @return
     *     returns boolean
     * @throws ClassNotFoundException_Exception
     * @throws ParseException_Exception
     * @throws IllegalAccessException_Exception
     * @throws InstantiationException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "inserirPublicacao", targetNamespace = "http://soa.br/", className = "br.soa.InserirPublicacao")
    @ResponseWrapper(localName = "inserirPublicacaoResponse", targetNamespace = "http://soa.br/", className = "br.soa.InserirPublicacaoResponse")
    @Action(input = "http://soa.br/ServicoApp/inserirPublicacaoRequest", output = "http://soa.br/ServicoApp/inserirPublicacaoResponse", fault = {
        @FaultAction(className = ClassNotFoundException_Exception.class, value = "http://soa.br/ServicoApp/inserirPublicacao/Fault/ClassNotFoundException"),
        @FaultAction(className = InstantiationException_Exception.class, value = "http://soa.br/ServicoApp/inserirPublicacao/Fault/InstantiationException"),
        @FaultAction(className = IllegalAccessException_Exception.class, value = "http://soa.br/ServicoApp/inserirPublicacao/Fault/IllegalAccessException"),
        @FaultAction(className = ParseException_Exception.class, value = "http://soa.br/ServicoApp/inserirPublicacao/Fault/ParseException")
    })
    public boolean inserirPublicacao(
        @WebParam(name = "titulo", targetNamespace = "")
        String titulo,
        @WebParam(name = "paginaInicial", targetNamespace = "")
        int paginaInicial,
        @WebParam(name = "paginaFinal", targetNamespace = "")
        int paginaFinal,
        @WebParam(name = "dataPublicacao", targetNamespace = "")
        String dataPublicacao)
        throws ClassNotFoundException_Exception, IllegalAccessException_Exception, InstantiationException_Exception, ParseException_Exception
    ;

}
