
package gov.usda.nrcs.wcc.awdbWebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getForecastsByPubDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getForecastsByPubDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stationTriplet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="elementCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="forecastPeriod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="beginPublicationDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="endPublicationDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getForecastsByPubDate", propOrder = {
    "stationTriplet",
    "elementCd",
    "forecastPeriod",
    "beginPublicationDate",
    "endPublicationDate"
})
public class GetForecastsByPubDate {

    @XmlElement(required = true)
    protected String stationTriplet;
    @XmlElement(required = true)
    protected String elementCd;
    @XmlElement(required = true)
    protected String forecastPeriod;
    @XmlElement(required = true)
    protected String beginPublicationDate;
    @XmlElement(required = true)
    protected String endPublicationDate;

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
     * Gets the value of the beginPublicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginPublicationDate() {
        return beginPublicationDate;
    }

    /**
     * Sets the value of the beginPublicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginPublicationDate(String value) {
        this.beginPublicationDate = value;
    }

    /**
     * Gets the value of the endPublicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPublicationDate() {
        return endPublicationDate;
    }

    /**
     * Sets the value of the endPublicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPublicationDate(String value) {
        this.endPublicationDate = value;
    }

}
