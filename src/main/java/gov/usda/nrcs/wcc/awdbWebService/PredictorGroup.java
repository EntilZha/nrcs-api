
package gov.usda.nrcs.wcc.awdbWebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for predictorGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="predictorGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customStationListName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataSourceCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elementCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="globalMonthChangeAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="negativeWeightAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="networks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="states" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="upstreamForecast" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "predictorGroup", propOrder = {
    "customStationListName",
    "dataSourceCd",
    "elementCd",
    "globalMonthChangeAllowed",
    "groupName",
    "groupNumber",
    "negativeWeightAllowed",
    "networks",
    "states",
    "upstreamForecast"
})
public class PredictorGroup {

    protected String customStationListName;
    protected String dataSourceCd;
    protected String elementCd;
    protected boolean globalMonthChangeAllowed;
    protected String groupName;
    protected Integer groupNumber;
    protected boolean negativeWeightAllowed;
    protected String networks;
    protected String states;
    protected boolean upstreamForecast;

    /**
     * Gets the value of the customStationListName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomStationListName() {
        return customStationListName;
    }

    /**
     * Sets the value of the customStationListName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomStationListName(String value) {
        this.customStationListName = value;
    }

    /**
     * Gets the value of the dataSourceCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSourceCd() {
        return dataSourceCd;
    }

    /**
     * Sets the value of the dataSourceCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSourceCd(String value) {
        this.dataSourceCd = value;
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
     * Gets the value of the globalMonthChangeAllowed property.
     * 
     */
    public boolean isGlobalMonthChangeAllowed() {
        return globalMonthChangeAllowed;
    }

    /**
     * Sets the value of the globalMonthChangeAllowed property.
     * 
     */
    public void setGlobalMonthChangeAllowed(boolean value) {
        this.globalMonthChangeAllowed = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the groupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGroupNumber() {
        return groupNumber;
    }

    /**
     * Sets the value of the groupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGroupNumber(Integer value) {
        this.groupNumber = value;
    }

    /**
     * Gets the value of the negativeWeightAllowed property.
     * 
     */
    public boolean isNegativeWeightAllowed() {
        return negativeWeightAllowed;
    }

    /**
     * Sets the value of the negativeWeightAllowed property.
     * 
     */
    public void setNegativeWeightAllowed(boolean value) {
        this.negativeWeightAllowed = value;
    }

    /**
     * Gets the value of the networks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworks() {
        return networks;
    }

    /**
     * Sets the value of the networks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworks(String value) {
        this.networks = value;
    }

    /**
     * Gets the value of the states property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStates() {
        return states;
    }

    /**
     * Sets the value of the states property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStates(String value) {
        this.states = value;
    }

    /**
     * Gets the value of the upstreamForecast property.
     * 
     */
    public boolean isUpstreamForecast() {
        return upstreamForecast;
    }

    /**
     * Sets the value of the upstreamForecast property.
     * 
     */
    public void setUpstreamForecast(boolean value) {
        this.upstreamForecast = value;
    }

}
