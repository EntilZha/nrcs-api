
package gov.usda.nrcs.wcc.awdbWebService;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for averagesPeakData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="averagesPeakData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="duration" type="{http://www.wcc.nrcs.usda.gov/ns/awdbWebService}duration" minOccurs="0"/>
 *         &lt;element name="flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peakDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="peakMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "averagesPeakData", propOrder = {
    "duration",
    "flag",
    "peakDay",
    "peakMonth",
    "value"
})
@XmlSeeAlso({
    CentralTendencyPeakData.class
})
public class AveragesPeakData {

    @XmlSchemaType(name = "string")
    protected Duration duration;
    protected String flag;
    protected int peakDay;
    protected int peakMonth;
    protected BigDecimal value;

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Gets the value of the flag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag(String value) {
        this.flag = value;
    }

    /**
     * Gets the value of the peakDay property.
     * 
     */
    public int getPeakDay() {
        return peakDay;
    }

    /**
     * Sets the value of the peakDay property.
     * 
     */
    public void setPeakDay(int value) {
        this.peakDay = value;
    }

    /**
     * Gets the value of the peakMonth property.
     * 
     */
    public int getPeakMonth() {
        return peakMonth;
    }

    /**
     * Sets the value of the peakMonth property.
     * 
     */
    public void setPeakMonth(int value) {
        this.peakMonth = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

}
