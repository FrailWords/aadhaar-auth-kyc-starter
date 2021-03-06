//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.03 at 08:09:15 PM IST 
//


package in.gov.uidai.core.model.xsd.otp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Otp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Otp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Opts" type="{http://www.uidai.gov.in/authentication/otp/1.0}Opts" minOccurs="0"/>
 *         &lt;element name="Tkn" type="{http://www.uidai.gov.in/authentication/otp/1.0}Tkn" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uid" use="required" type="{http://www.uidai.gov.in/authentication/common/types/1.0}uid" />
 *       &lt;attribute name="tid" use="required" type="{http://www.uidai.gov.in/authentication/common/types/1.0}Tid" />
 *       &lt;attribute name="ac" use="required" type="{http://www.uidai.gov.in/authentication/common/types/1.0}AuaCode" />
 *       &lt;attribute name="sa" use="required" type="{http://www.uidai.gov.in/authentication/common/types/1.0}AuaCode" />
 *       &lt;attribute name="ver" use="required" type="{http://www.uidai.gov.in/authentication/common/types/1.0}Ver" />
 *       &lt;attribute name="txn" use="required" type="{http://www.uidai.gov.in/authentication/common/types/1.0}Txn" />
 *       &lt;attribute name="lk" use="required" type="{http://www.uidai.gov.in/authentication/common/types/1.0}LicenseKey" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Otp", propOrder = {
    "opts",
    "tkn"
})
public class Otp {

    @XmlElement(name = "Opts")
    protected Opts opts;
    @XmlElement(name = "Tkn")
    protected Tkn tkn;
    @XmlAttribute(name = "uid", required = true)
    protected String uid;
    @XmlAttribute(name = "tid", required = true)
    protected String tid;
    @XmlAttribute(name = "ac", required = true)
    protected String ac;
    @XmlAttribute(name = "sa", required = true)
    protected String sa;
    @XmlAttribute(name = "ver", required = true)
    protected String ver;
    @XmlAttribute(name = "txn", required = true)
    protected String txn;
    @XmlAttribute(name = "lk", required = true)
    protected String lk;

    /**
     * Gets the value of the opts property.
     * 
     * @return
     *     possible object is
     *     {@link Opts }
     *     
     */
    public Opts getOpts() {
        return opts;
    }

    /**
     * Sets the value of the opts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Opts }
     *     
     */
    public void setOpts(Opts value) {
        this.opts = value;
    }

    /**
     * Gets the value of the tkn property.
     * 
     * @return
     *     possible object is
     *     {@link Tkn }
     *     
     */
    public Tkn getTkn() {
        return tkn;
    }

    /**
     * Sets the value of the tkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tkn }
     *     
     */
    public void setTkn(Tkn value) {
        this.tkn = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the tid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTid() {
        return tid;
    }

    /**
     * Sets the value of the tid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTid(String value) {
        this.tid = value;
    }

    /**
     * Gets the value of the ac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAc() {
        return ac;
    }

    /**
     * Sets the value of the ac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAc(String value) {
        this.ac = value;
    }

    /**
     * Gets the value of the sa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSa() {
        return sa;
    }

    /**
     * Sets the value of the sa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSa(String value) {
        this.sa = value;
    }

    /**
     * Gets the value of the ver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVer() {
        return ver;
    }

    /**
     * Sets the value of the ver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVer(String value) {
        this.ver = value;
    }

    /**
     * Gets the value of the txn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxn() {
        return txn;
    }

    /**
     * Sets the value of the txn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxn(String value) {
        this.txn = value;
    }

    /**
     * Gets the value of the lk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLk() {
        return lk;
    }

    /**
     * Sets the value of the lk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLk(String value) {
        this.lk = value;
    }

}
