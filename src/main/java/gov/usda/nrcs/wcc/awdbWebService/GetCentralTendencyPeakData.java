
package gov.usda.nrcs.wcc.awdbWebService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCentralTendencyPeakData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCentralTendencyPeakData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stationTriplets" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="elementCd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="heightDepth" type="{http://www.wcc.nrcs.usda.gov/ns/awdbWebService}heightDepth" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.wcc.nrcs.usda.gov/ns/awdbWebService}duration"/>
 *         &lt;element name="getFlags" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="centralTendencyType" type="{http://www.wcc.nrcs.usda.gov/ns/awdbWebService}centralTendencyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCentralTendencyPeakData", propOrder = {
    "stationTriplets",
    "elementCd",
    "heightDepth",
    "duration",
    "getFlags",
    "centralTendencyType"
})
public class GetCentralTendencyPeakData {

    @XmlElement(required = true)
    protected List<String> stationTriplets;
    @XmlElement(required = true)
    protected String elementCd;
    protected HeightDepth heightDepth;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Duration duration;
    protected boolean getFlags;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CentralTendencyType centralTendencyType;

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
     * Gets the value of the getFlags property.
     * 
     */
    public boolean isGetFlags() {
        return getFlags;
    }

    /**
     * Sets the value of the getFlags property.
     * 
     */
    public void setGetFlags(boolean value) {
        this.getFlags = value;
    }

    /**
     * Gets the value of the centralTendencyType property.
     * 
     * @return
     *     possible object is
     *     {@link CentralTendencyType }
     *     
     */
    public CentralTendencyType getCentralTendencyType() {
        return centralTendencyType;
    }

    /**
     * Sets the value of the centralTendencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentralTendencyType }
     *     
     */
    public void setCentralTendencyType(CentralTendencyType value) {
        this.centralTendencyType = value;
    }

}
