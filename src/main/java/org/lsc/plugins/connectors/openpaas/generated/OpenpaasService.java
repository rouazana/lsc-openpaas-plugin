//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.05 at 05:11:12 PM CEST 
//


package org.lsc.plugins.connectors.openpaas.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.lsc.configuration.ServiceType;
import org.lsc.configuration.ValuesType;


/**
 * <p>Java class for openpaasService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="openpaasService">
 *   &lt;complexContent>
 *     &lt;extension base="{http://lsc-project.org/XSD/lsc-core-2.1.xsd}serviceType">
 *       &lt;sequence>
 *         &lt;element name="domainUUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="writableAttributes" type="{http://lsc-project.org/XSD/lsc-core-2.1.xsd}valuesType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "openpaasService", namespace = "http://lsc-project.org/XSD/lsc-openpaas-plugin-1.0.xsd", propOrder = {
    "domainUUID",
    "writableAttributes"
})
@XmlSeeAlso({
    OpenpaasGroupService.class
})
public abstract class OpenpaasService
    extends ServiceType
{

    @XmlElement(required = true)
    protected String domainUUID;
    @XmlElement(required = true)
    protected ValuesType writableAttributes;

    /**
     * Gets the value of the domainUUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainUUID() {
        return domainUUID;
    }

    /**
     * Sets the value of the domainUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainUUID(String value) {
        this.domainUUID = value;
    }

    /**
     * Gets the value of the writableAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ValuesType }
     *     
     */
    public ValuesType getWritableAttributes() {
        return writableAttributes;
    }

    /**
     * Sets the value of the writableAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesType }
     *     
     */
    public void setWritableAttributes(ValuesType value) {
        this.writableAttributes = value;
    }

}