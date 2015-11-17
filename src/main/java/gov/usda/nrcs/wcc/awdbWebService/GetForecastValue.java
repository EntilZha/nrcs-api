
package gov.usda.nrcs.wcc.awdbWebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getForecastValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getForecastValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stationTriplet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="elementCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="forecastPeriod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="probability" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="publicationYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="publicationMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="publicationDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getForecastValue", propOrder = {
    "stationTriplet",
    "elementCd",
    "forecastPeriod",
    "probability",
    "publicationYear",
    "publicationMonth",
    "publicationDay"
})
public class GetForecastValue {

    @XmlElement(required = true)
    protected String stationTriplet;
    @XmlElement(required = true)
    protected String elementCd;
    @XmlElement(required = true)
    protected String forecastPeriod;
    protected int probability;
    protected int publicationYear;
    protected int publicationMonth;
    protected int publicationDay;

    /**
     * Gets the value of the stationTriplet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationTriplet() {
        return stationTriplet;
    }

    /**
     * Sets the value of the stationTriplet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationTriplet(String value) {
        this.stationTriplet = value;
    }

    /**
     * Gets the value of the elementCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementCd() {
        return elementCd;
    }

    /**
     * Sets the value of the elementCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementCd(String value) {
        this.elementCd = value;
    }

    /**
     * Gets the value of the forecastPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForecastPeriod() {
        return forecastPeriod;
    }

    /**
     * Sets the value of the forecastPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForecastPeriod(String value) {
        this.forecastPeriod = value;
    }

    /**
     * Gets the value of the probability property.
     * 
     */
    public int getProbability() {
        return probability;
    }

    /**
     * Sets the value of the probability property.
     * 
     */
    public void setProbability(int value) {
        this.probability = value;
    }

    /**
     * Gets the value of the publicationYear property.
     * 
     */
    public int getPublicationYear() {
        return publicationYear;
    }

    /**
     * Sets the value of the publicationYear property.
     * 
     */
    public void setPublicationYear(int value) {
        this.publicationYear = value;
    }

    /**
     * Gets the value of the publicationMonth property.
     * 
     */
    public int getPublicationMonth() {
        return publicationMonth;
    }

    /**
     * Sets the value of the publicationMonth property.
     * 
     */
    public void setPublicationMonth(int value) {
        this.publicationMonth = value;
    }

    /**
     * Gets the value of the publicationDay property.
     * 
     */
    public int getPublicationDay() {
        return publicationDay;
    }

    /**
     * Sets the value of the publicationDay property.
     * 
     */
    public void setPublicationDay(int value) {
        this.publicationDay = value;
    }

}
