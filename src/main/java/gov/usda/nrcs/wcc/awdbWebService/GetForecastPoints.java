
package gov.usda.nrcs.wcc.awdbWebService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getForecastPoints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getForecastPoints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stationIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="stateCds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="networkCds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="forecastPointNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hucs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="forecasters" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "getForecastPoints", propOrder = {
    "stationIds",
    "stateCds",
    "networkCds",
    "forecastPointNames",
    "hucs",
    "forecasters",
    "logicalAnd"
})
public class GetForecastPoints {

    protected List<String> stationIds;
    protected List<String> stateCds;
    protected List<String> networkCds;
    protected List<String> forecastPointNames;
    protected List<String> hucs;
    protected List<String> forecasters;
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
     * Gets the value of the forecastPointNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecastPointNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecastPointNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getForecastPointNames() {
        if (forecastPointNames == null) {
            forecastPointNames = new ArrayList<String>();
        }
        return this.forecastPointNames;
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
     * Gets the value of the forecasters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecasters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecasters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getForecasters() {
        if (forecasters == null) {
            forecasters = new ArrayList<String>();
        }
        return this.forecasters;
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
