
package gov.usda.nrcs.wcc.awdbWebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllForecastsForStation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllForecastsForStation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stationTriplet" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "getAllForecastsForStation", propOrder = {
    "stationTriplet",
    "beginPublicationDate",
    "endPublicationDate"
})
public class GetAllForecastsForStation {

    @XmlElement(required = true)
    protected String stationTriplet;
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
