
package br.soa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de inserirPublicacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="inserirPublicacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paginaInicial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="paginaFinal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dataPublicacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inserirPublicacao", propOrder = {
    "titulo",
    "paginaInicial",
    "paginaFinal",
    "dataPublicacao"
})
public class InserirPublicacao {

    protected String titulo;
    protected int paginaInicial;
    protected int paginaFinal;
    protected String dataPublicacao;

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
     * Obtém o valor da propriedade dataPublicacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPublicacao() {
        return dataPublicacao;
    }

    /**
     * Define o valor da propriedade dataPublicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPublicacao(String value) {
        this.dataPublicacao = value;
    }

}
