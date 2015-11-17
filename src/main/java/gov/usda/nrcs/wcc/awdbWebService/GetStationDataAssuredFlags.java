
package gov.usda.nrcs.wcc.awdbWebService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getStationDataAssuredFlags complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getStationDataAssuredFlags">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stationTriplets" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="elementCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ordinal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="heightDepth" type="{http://www.wcc.nrcs.usda.gov/ns/awdbWebService}heightDepth" minOccurs="0"/>
 *         &lt;element name="durationCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="beginWaterYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="endWaterYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStationDataAssuredFlags", propOrder = {
    "stationTriplets",
    "elementCd",
    "ordinal",
    "heightDepth",
    "durationCd",
    "beginWaterYear",
    "endWaterYear"
})
public class GetStationDataAssuredFlags {

    @XmlElement(required = true)
    protected List<String> stationTriplets;
    @XmlElement(required = true)
    protected String elementCd;
    protected int ordinal;
    protected HeightDepth heightDepth;
    @XmlElement(required = true)
    protected String durationCd;
    protected int beginWaterYear;
    protected int endWaterYear;

    /**
     * Gets the value of the stationTriplets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stationTriplets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStationTriplets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStationTriplets() {
        if (stationTriplets == null) {
            stationTriplets = new ArrayList<String>();
        }
        return this.stationTriplets;
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
     * Gets the value of the ordinal property.
     * 
     */
    public int getOrdinal() {
        return ordinal;
    }

    /**
     * Sets the value of the ordinal property.
     * 
     */
    public void setOrdinal(int value) {
        this.ordinal = value;
    }

    /**
     * Gets the value of the heightDepth property.
     * 
     * @return
     *     possible object is
     *     {@link HeightDepth }
     *     
     */
    public HeightDepth getHeightDepth() {
        return heightDepth;
    }

    /**
     * Sets the value of the heightDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeightDepth }
     *     
     */
    public void setHeightDepth(HeightDepth value) {
        this.heightDepth = value;
    }

    /**
     * Gets the value of the durationCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationCd() {
        return durationCd;
    }

    /**
     * Sets the value of the durationCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationCd(String value) {
        this.durationCd = value;
    }

    /**
     * Gets the value of the beginWaterYear property.
     * 
     */
    public int getBeginWaterYear() {
        return beginWaterYear;
    }

    /**
     * Sets the value of the beginWaterYear property.
     * 
     */
    public void setBeginWaterYear(int value) {
        this.beginWaterYear = value;
    }

    /**
     * Gets the value of the endWaterYear property.
     * 
     */
    public int getEndWaterYear() {
        return endWaterYear;
    }

    /**
     * Sets the value of the endWaterYear property.
     * 
     */
    public void setEndWaterYear(int value) {
        this.endWaterYear = value;
    }

}
