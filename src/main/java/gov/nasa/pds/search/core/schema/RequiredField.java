//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.01 at 02:00:28 PM PDT 
//


package gov.nasa.pds.search.core.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequiredField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequiredField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{}registryPath"/>
 *         &lt;element ref="{}outputString"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequiredField", propOrder = {
    "registryPath",
    "outputString"
})
public class RequiredField {

    protected String registryPath;
    protected String outputString;

    /**
     * Gets the value of the registryPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryPath() {
        return registryPath;
    }

    /**
     * Sets the value of the registryPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistryPath(String value) {
        this.registryPath = value;
    }

    /**
     * Gets the value of the outputString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputString() {
        return outputString;
    }

    /**
     * Sets the value of the outputString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputString(String value) {
        this.outputString = value;
    }

}
