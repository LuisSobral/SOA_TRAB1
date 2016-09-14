
package com.parasoft.wsdl.calculator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numerator" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="denominator" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "numerator",
    "denominator"
})
@XmlRootElement(name = "divide")
public class Divide {

    protected float numerator;
    protected float denominator;

    /**
     * Obtém o valor da propriedade numerator.
     * 
     */
    public float getNumerator() {
        return numerator;
    }

    /**
     * Define o valor da propriedade numerator.
     * 
     */
    public void setNumerator(float value) {
        this.numerator = value;
    }

    /**
     * Obtém o valor da propriedade denominator.
     * 
     */
    public float getDenominator() {
        return denominator;
    }

    /**
     * Define o valor da propriedade denominator.
     * 
     */
    public void setDenominator(float value) {
        this.denominator = value;
    }

}
