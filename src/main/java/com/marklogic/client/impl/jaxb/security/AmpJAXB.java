//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.18 at 11:38:21 AM PDT 
//


package com.marklogic.client.impl.jaxb.security;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 	The amplification of additional roles.
 *       
 * 
 * <p>Java class for amp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="amp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{http://marklogic.com/xdmp/security}amp-id"/>
 *         &lt;element ref="{http://marklogic.com/xdmp/security}local-name"/>
 *         &lt;element ref="{http://marklogic.com/xdmp/security}namespace"/>
 *         &lt;element ref="{http://marklogic.com/xdmp/security}document-uri"/>
 *         &lt;element ref="{http://marklogic.com/xdmp/security}database"/>
 *         &lt;element ref="{http://marklogic.com/xdmp/security}role-ids"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "amp", propOrder = {

})
public class AmpJAXB {

    @XmlElement(name = "amp-id", required = true)
    protected BigInteger ampId;
    @XmlElement(name = "local-name", required = true)
    protected String localName;
    @XmlElement(required = true)
    protected String namespace;
    @XmlElement(name = "document-uri", required = true)
    protected String documentUri;
    @XmlElement(required = true)
    protected BigInteger database;
    @XmlElement(name = "role-ids", required = true)
    protected RoleIdsJAXB roleIds;

    /**
     * Gets the value of the ampId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmpId() {
        return ampId;
    }

    /**
     * Sets the value of the ampId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmpId(BigInteger value) {
        this.ampId = value;
    }

    /**
     * Gets the value of the localName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalName() {
        return localName;
    }

    /**
     * Sets the value of the localName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalName(String value) {
        this.localName = value;
    }

    /**
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
    }

    /**
     * Gets the value of the documentUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentUri() {
        return documentUri;
    }

    /**
     * Sets the value of the documentUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentUri(String value) {
        this.documentUri = value;
    }

    /**
     * Gets the value of the database property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDatabase() {
        return database;
    }

    /**
     * Sets the value of the database property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDatabase(BigInteger value) {
        this.database = value;
    }

    /**
     * Gets the value of the roleIds property.
     * 
     * @return
     *     possible object is
     *     {@link RoleIdsJAXB }
     *     
     */
    public RoleIdsJAXB getRoleIds() {
        return roleIds;
    }

    /**
     * Sets the value of the roleIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleIdsJAXB }
     *     
     */
    public void setRoleIds(RoleIdsJAXB value) {
        this.roleIds = value;
    }

}