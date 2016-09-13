
package br.soa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de autorPublicacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="autorPublicacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataPublicao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id_autor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_pub" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeCitacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paginaFinal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="paginaInicial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "autorPublicacao", propOrder = {
    "cpf",
    "dataPublicao",
    "idAutor",
    "idPub",
    "nome",
    "nomeCitacao",
    "paginaFinal",
    "paginaInicial",
    "titulo"
})
public class AutorPublicacao {

    protected String cpf;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPublicao;
    @XmlElement(name = "id_autor")
    protected int idAutor;
    @XmlElement(name = "id_pub")
    protected int idPub;
    protected String nome;
    protected String nomeCitacao;
    protected int paginaFinal;
    protected int paginaInicial;
    protected String titulo;

    /**
     * Obtém o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
    }

    /**
     * Obtém o valor da propriedade dataPublicao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPublicao() {
        return dataPublicao;
    }

    /**
     * Define o valor da propriedade dataPublicao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPublicao(XMLGregorianCalendar value) {
        this.dataPublicao = value;
    }

    /**
     * Obtém o valor da propriedade idAutor.
     * 
     */
    public int getIdAutor() {
        return idAutor;
    }

    /**
     * Define o valor da propriedade idAutor.
     * 
     */
    public void setIdAutor(int value) {
        this.idAutor = value;
    }

    /**
     * Obtém o valor da propriedade idPub.
     * 
     */
    public int getIdPub() {
        return idPub;
    }

    /**
     * Define o valor da propriedade idPub.
     * 
     */
    public void setIdPub(int value) {
        this.idPub = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade nomeCitacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCitacao() {
        return nomeCitacao;
    }

    /**
     * Define o valor da propriedade nomeCitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCitacao(String value) {
        this.nomeCitacao = value;
    }

    /**
     * Obtém o valor da propriedade paginaFinal.
     * 
     */
    public int getPaginaFinal() {
        return paginaFinal;
    }

    /**
     * Define o valor da propriedade paginaFinal.
     * 
     */
    public void setPaginaFinal(int value) {
        this.paginaFinal = value;
    }

    /**
     * Obtém o valor da propriedade paginaInicial.
     * 
     */
    public int getPaginaInicial() {
        return paginaInicial;
    }

    /**
     * Define o valor da propriedade paginaInicial.
     * 
     */
    public void setPaginaInicial(int value) {
        this.paginaInicial = value;
    }

    /**
     * Obtém o valor da propriedade titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o valor da propriedade titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

}
