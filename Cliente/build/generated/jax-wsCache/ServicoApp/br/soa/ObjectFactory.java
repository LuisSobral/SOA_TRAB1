
package br.soa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.soa package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListarPublicacoesResponse_QNAME = new QName("http://soa.br/", "listarPublicacoesResponse");
    private final static QName _AtualizarPublicacao_QNAME = new QName("http://soa.br/", "atualizarPublicacao");
    private final static QName _AtualizarPublicacaoResponse_QNAME = new QName("http://soa.br/", "atualizarPublicacaoResponse");
    private final static QName _DeletarPublicacaoResponse_QNAME = new QName("http://soa.br/", "deletarPublicacaoResponse");
    private final static QName _InserirPublicacaoResponse_QNAME = new QName("http://soa.br/", "inserirPublicacaoResponse");
    private final static QName _ParseException_QNAME = new QName("http://soa.br/", "ParseException");
    private final static QName _ClassNotFoundException_QNAME = new QName("http://soa.br/", "ClassNotFoundException");
    private final static QName _IllegalAccessException_QNAME = new QName("http://soa.br/", "IllegalAccessException");
    private final static QName _InstantiationException_QNAME = new QName("http://soa.br/", "InstantiationException");
    private final static QName _ListarPublicacoes_QNAME = new QName("http://soa.br/", "listarPublicacoes");
    private final static QName _DeletarPublicacao_QNAME = new QName("http://soa.br/", "deletarPublicacao");
    private final static QName _InserirPublicacao_QNAME = new QName("http://soa.br/", "inserirPublicacao");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.soa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarPublicacoesResponse }
     * 
     */
    public ListarPublicacoesResponse createListarPublicacoesResponse() {
        return new ListarPublicacoesResponse();
    }

    /**
     * Create an instance of {@link AtualizarPublicacao }
     * 
     */
    public AtualizarPublicacao createAtualizarPublicacao() {
        return new AtualizarPublicacao();
    }

    /**
     * Create an instance of {@link AtualizarPublicacaoResponse }
     * 
     */
    public AtualizarPublicacaoResponse createAtualizarPublicacaoResponse() {
        return new AtualizarPublicacaoResponse();
    }

    /**
     * Create an instance of {@link DeletarPublicacaoResponse }
     * 
     */
    public DeletarPublicacaoResponse createDeletarPublicacaoResponse() {
        return new DeletarPublicacaoResponse();
    }

    /**
     * Create an instance of {@link InserirPublicacaoResponse }
     * 
     */
    public InserirPublicacaoResponse createInserirPublicacaoResponse() {
        return new InserirPublicacaoResponse();
    }

    /**
     * Create an instance of {@link ParseException }
     * 
     */
    public ParseException createParseException() {
        return new ParseException();
    }

    /**
     * Create an instance of {@link ClassNotFoundException }
     * 
     */
    public ClassNotFoundException createClassNotFoundException() {
        return new ClassNotFoundException();
    }

    /**
     * Create an instance of {@link DeletarPublicacao }
     * 
     */
    public DeletarPublicacao createDeletarPublicacao() {
        return new DeletarPublicacao();
    }

    /**
     * Create an instance of {@link InserirPublicacao }
     * 
     */
    public InserirPublicacao createInserirPublicacao() {
        return new InserirPublicacao();
    }

    /**
     * Create an instance of {@link IllegalAccessException }
     * 
     */
    public IllegalAccessException createIllegalAccessException() {
        return new IllegalAccessException();
    }

    /**
     * Create an instance of {@link InstantiationException }
     * 
     */
    public InstantiationException createInstantiationException() {
        return new InstantiationException();
    }

    /**
     * Create an instance of {@link ListarPublicacoes }
     * 
     */
    public ListarPublicacoes createListarPublicacoes() {
        return new ListarPublicacoes();
    }

    /**
     * Create an instance of {@link AutorPublicacao }
     * 
     */
    public AutorPublicacao createAutorPublicacao() {
        return new AutorPublicacao();
    }

    /**
     * Create an instance of {@link Throwable }
     * 
     */
    public Throwable createThrowable() {
        return new Throwable();
    }

    /**
     * Create an instance of {@link StackTraceElement }
     * 
     */
    public StackTraceElement createStackTraceElement() {
        return new StackTraceElement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPublicacoesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.br/", name = "listarPublicacoesResponse")
    public JAXBElement<ListarPublicacoesResponse> createListarPublicacoesResponse(ListarPublicacoesResponse value) {
        return new JAXBElement<ListarPublicacoesResponse>(_ListarPublicacoesResponse_QNAME, ListarPublicacoesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarPublicacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.br/", name = "atualizarPublicacao")
    public JAXBElement<AtualizarPublicacao> createAtualizarPublicacao(AtualizarPublicacao value) {
        return new JAXBElement<AtualizarPublicacao>(_AtualizarPublicacao_QNAME, AtualizarPublicacao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarPublicacaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.br/", name = "atualizarPublicacaoResponse")
    public JAXBElement<AtualizarPublicacaoResponse> createAtualizarPublicacaoResponse(AtualizarPublicacaoResponse value) {
        return new JAXBElement<AtualizarPublicacaoResponse>(_AtualizarPublicacaoResponse_QNAME, AtualizarPublicacaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarPublicacaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.br/", name = "deletarPublicacaoResponse")
    public JAXBElement<DeletarPublicacaoResponse> createDeletarPublicacaoResponse(DeletarPublicacaoResponse value) {
        return new JAXBElement<DeletarPublicacaoResponse>(_DeletarPublicacaoResponse_QNAME, DeletarPublicacaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirPublicacaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.br/", name = "inserirPublicacaoResponse")
    public JAXBElement<InserirPublicacaoResponse> createInserirPublicacaoResponse(InserirPublicacaoResponse value) {
        return new JAXBElement<InserirPublicacaoResponse>(_InserirPublicacaoResponse_QNAME, InserirPublicacaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.br/", name = "ParseException")
    public JAXBElement<ParseException> createParseException(ParseException value) {
        return new JAXBElement<ParseException>(_ParseException_QNAME, ParseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.br/", name = "ClassNotFoundException")
    public JAXBElement<ClassNotFoundException> createClassNotFoundException(ClassNotFoundException value) {
        return new JAXBElement<ClassNotFoundException>(_ClassNotFoundException_QNAME, ClassNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IllegalAccessException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.br/", name = "IllegalAccessException")
    public JAXBElement<IllegalAccessException> createIllegalAccessException(IllegalAccessException value) {
        return new JAXBElement<IllegalAccessException>(_IllegalAccessException_QNAME, IllegalAccessException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstantiationException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.br/", name = "InstantiationException")
    public JAXBElement<InstantiationException> createInstantiationException(InstantiationException value) {
        return new JAXBElement<InstantiationException>(_InstantiationException_QNAME, InstantiationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPublicacoes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.br/", name = "listarPublicacoes")
    public JAXBElement<ListarPublicacoes> createListarPublicacoes(ListarPublicacoes value) {
        return new JAXBElement<ListarPublicacoes>(_ListarPublicacoes_QNAME, ListarPublicacoes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarPublicacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.br/", name = "deletarPublicacao")
    public JAXBElement<DeletarPublicacao> createDeletarPublicacao(DeletarPublicacao value) {
        return new JAXBElement<DeletarPublicacao>(_DeletarPublicacao_QNAME, DeletarPublicacao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirPublicacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.br/", name = "inserirPublicacao")
    public JAXBElement<InserirPublicacao> createInserirPublicacao(InserirPublicacao value) {
        return new JAXBElement<InserirPublicacao>(_InserirPublicacao_QNAME, InserirPublicacao.class, null, value);
    }

}
