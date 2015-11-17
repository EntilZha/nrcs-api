
package gov.usda.nrcs.wcc.awdbWebService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getStations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getStations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stationIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="stateCds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="networkCds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hucs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="countyNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="minLatitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="maxLatitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="minLongitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="maxLongitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="minElevation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="maxElevation" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="elementCds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ordinals" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="heightDepths" type="{http://www.wcc.nrcs.usda.gov/ns/awdbWebService}heightDepth" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="logicalAnd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStations", propOrder = {
    "stationIds",
    "stateCds",
    "networkCds",
    "hucs",
    "countyNames",
    "minLatitude",
    "maxLatitude",
    "minLongitude",
    "maxLongitude",
    "minElevation",
    "maxElevation",
    "elementCds",
    "ordinals",
    "heightDepths",
    "logicalAnd"
})
public class GetStations {

    protected List<String> stationIds;
    protected List<String> stateCds;
    protected List<String> networkCds;
    protected List<String> hucs;
    protected List<String> countyNames;
    protected BigDecimal minLatitude;
    protected BigDecimal maxLatitude;
    protected BigDecimal minLongitude;
    protected BigDecimal maxLongitude;
    protected BigDecimal minElevation;
    protected BigDecimal maxElevation;
    protected List<String> elementCds;
    @XmlElement(type = Integer.class)
    protected List<Integer> ordinals;
    protected List<HeightDepth> heightDepths;
    protected boolean logicalAnd;

    /**
     * Gets the value of the stationIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stationIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStationIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStationIds() {
        if (stationIds == null) {
            stationIds = new ArrayList<String>();
        }
        return this.stationIds;
    }

    /**
     * Gets the value of the stateCds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stateCds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStateCds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStateCds() {
        if (stateCds == null) {
            stateCds = new ArrayList<String>();
        }
        return this.stateCds;
    }

    /**
     * Gets the value of the networkCds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkCds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkCds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNetworkCds() {
        if (networkCds == null) {
            networkCds = new ArrayList<String>();
        }
        return this.networkCds;
    }

    /**
     * Gets the value of the hucs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hucs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHucs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHucs() {
        if (hucs == null) {
            hucs = new ArrayList<String>();
        }
        return this.hucs;
    }

    /**
     * Gets the value of the countyNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countyNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountyNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCountyNames() {
        if (countyNames == null) {
            countyNames = new ArrayList<String>();
        }
        return this.countyNames;
    }

    /**
     * Gets the value of the minLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinLatitude() {
        return minLatitude;
    }

    /**
     * Sets the value of the minLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinLatitude(BigDecimal value) {
        this.minLatitude = value;
    }

    /**
     * Gets the value of the maxLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxLatitude() {
        return maxLatitude;
    }

    /**
     * Sets the value of the maxLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxLatitude(BigDecimal value) {
        this.maxLatitude = value;
    }

    /**
     * Gets the value of the minLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinLongitude() {
        return minLongitude;
    }

    /**
     * Sets the value of the minLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinLongitude(BigDecimal value) {
        this.minLongitude = value;
    }

    /**
     * Gets the value of the maxLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxLongitude() {
        return maxLongitude;
    }

    /**
     * Sets the value of the maxLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxLongitude(BigDecimal value) {
        this.maxLongitude = value;
    }

    /**
     * Gets the value of the minElevation property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinElevation() {
        return minElevation;
    }

    /**
     * Sets the value of the minElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinElevation(BigDecimal value) {
        this.minElevation = value;
    }

    /**
     * Gets the value of the maxElevation property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxElevation() {
        return maxElevation;
    }

    /**
     * Sets the value of the maxElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxElevation(BigDecimal value) {
        this.maxElevation = value;
    }

    /**
     * Gets the value of the elementCds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementCds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementCds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getElementCds() {
        if (elementCds == null) {
            elementCds = new ArrayList<String>();
        }
        return this.elementCds;
    }

    /**
     * Gets the value of the ordinals property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ordinals property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdinals().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getOrdinals() {
        if (ordinals == null) {
            ordinals = new ArrayList<Integer>();
        }
        return this.ordinals;
    }

    /**
     * Gets the value of the heightDepths property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the heightDepths property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeightDepths().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeightDepth }
     * 
     * 
     */
    public List<HeightDepth> getHeightDepths() {
        if (heightDepths == null) {
            heightDepths = new ArrayList<HeightDepth>();
        }
        return this.heightDepths;
    }

    /**
     * Gets the value of the logicalAnd property.
     * 
     */
    public boolean isLogicalAnd() {
        return logicalAnd;
    }

    /**
     * Sets the value of the logicalAnd property.
     * 
     */
    public void setLogicalAnd(boolean value) {
        this.logicalAnd = value;
    }

}
