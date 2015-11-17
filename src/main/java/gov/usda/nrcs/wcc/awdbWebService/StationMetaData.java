
package gov.usda.nrcs.wcc.awdbWebService;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stationMetaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stationMetaData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="beginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elevation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fipsCountryCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fipsCountyCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fipsStateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="huc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stationDataTimeZone" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="stationTimeZone" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="stationTriplet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stationMetaData", propOrder = {
    "actonId",
    "beginDate",
    "countyName",
    "elevation",
    "endDate",
    "fipsCountryCd",
    "fipsCountyCd",
    "fipsStateNumber",
    "huc",
    "hud",
    "latitude",
    "longitude",
    "name",
    "shefId",
    "stationDataTimeZone",
    "stationTimeZone",
    "stationTriplet"
})
public class StationMetaData {

    protected String actonId;
    protected String beginDate;
    protected String countyName;
    protected BigDecimal elevation;
    protected String endDate;
    protected String fipsCountryCd;
    protected String fipsCountyCd;
    protected String fipsStateNumber;
    protected String huc;
    protected String hud;
    protected BigDecimal latitude;
    protected BigDecimal longitude;
    protected String name;
    protected String shefId;
    protected BigDecimal stationDataTimeZone;
    protected BigDecimal stationTimeZone;
    protected String stationTriplet;

    /**
     * Gets the value of the actonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActonId() {
        return actonId;
    }

    /**
     * Sets the value of the actonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActonId(String value) {
        this.actonId = value;
    }

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginDate(String value) {
        this.beginDate = value;
    }

    /**
     * Gets the value of the countyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountyName() {
        return countyName;
    }

    /**
     * Sets the value of the countyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountyName(String value) {
        this.countyName = value;
    }

    /**
     * Gets the value of the elevation property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getElevation() {
        return elevation;
    }

    /**
     * Sets the value of the elevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setElevation(BigDecimal value) {
        this.elevation = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the fipsCountryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFipsCountryCd() {
        return fipsCountryCd;
    }

    /**
     * Sets the value of the fipsCountryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFipsCountryCd(String value) {
        this.fipsCountryCd = value;
    }

    /**
     * Gets the value of the fipsCountyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFipsCountyCd() {
        return fipsCountyCd;
    }

    /**
     * Sets the value of the fipsCountyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFipsCountyCd(String value) {
        this.fipsCountyCd = value;
    }

    /**
     * Gets the value of the fipsStateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFipsStateNumber() {
        return fipsStateNumber;
    }

    /**
     * Sets the value of the fipsStateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFipsStateNumber(String value) {
        this.fipsStateNumber = value;
    }

    /**
     * Gets the value of the huc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuc() {
        return huc;
    }

    /**
     * Sets the value of the huc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuc(String value) {
        this.huc = value;
    }

    /**
     * Gets the value of the hud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHud() {
        return hud;
    }

    /**
     * Sets the value of the hud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHud(String value) {
        this.hud = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatitude(BigDecimal value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the shefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShefId() {
        return shefId;
    }

    /**
     * Sets the value of the shefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShefId(String value) {
        this.shefId = value;
    }

    /**
     * Gets the value of the stationDataTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStationDataTimeZone() {
        return stationDataTimeZone;
    }

    /**
     * Sets the value of the stationDataTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStationDataTimeZone(BigDecimal value) {
        this.stationDataTimeZone = value;
    }

    /**
     * Gets the value of the stationTimeZone property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStationTimeZone() {
        return stationTimeZone;
    }

    /**
     * Sets the value of the stationTimeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStationTimeZone(BigDecimal value) {
        this.stationTimeZone = value;
    }

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

}
