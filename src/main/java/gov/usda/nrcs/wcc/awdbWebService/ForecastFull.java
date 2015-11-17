
package gov.usda.nrcs.wcc.awdbWebService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for forecastFull complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="forecastFull">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="configuration" type="{http://www.wcc.nrcs.usda.gov/ns/awdbWebService}configuration" minOccurs="0"/>
 *         &lt;element name="coordinatedForecastIssueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coordinatedForecastProbabilities" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="coordinatedForecastValues" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="elementCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="equation" type="{http://www.wcc.nrcs.usda.gov/ns/awdbWebService}forecastEquation" minOccurs="0"/>
 *         &lt;element name="forecastFinal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="forecastPeriodCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forecastPeriodName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forecaster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hydrologistForecastIssueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hydrologistForecastProbabilities" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hydrologistForecastValues" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="originalForecastIssueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originalForecastProbabilities" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="originalForecastValues" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="otherAgencyCds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="otherAgencyForecastValues" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="periodAverage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="publicationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stationTriplet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "forecastFull", propOrder = {
    "comment",
    "configuration",
    "coordinatedForecastIssueDate",
    "coordinatedForecastProbabilities",
    "coordinatedForecastValues",
    "elementCd",
    "equation",
    "forecastFinal",
    "forecastPeriodCd",
    "forecastPeriodName",
    "forecaster",
    "hydrologistForecastIssueDate",
    "hydrologistForecastProbabilities",
    "hydrologistForecastValues",
    "originalForecastIssueDate",
    "originalForecastProbabilities",
    "originalForecastValues",
    "otherAgencyCds",
    "otherAgencyForecastValues",
    "periodAverage",
    "publicationDate",
    "stationTriplet",
    "unitCd"
})
public class ForecastFull {

    protected String comment;
    protected Configuration configuration;
    protected String coordinatedForecastIssueDate;
    @XmlElement(nillable = true)
    protected List<BigDecimal> coordinatedForecastProbabilities;
    @XmlElement(nillable = true)
    protected List<BigDecimal> coordinatedForecastValues;
    protected String elementCd;
    protected ForecastEquation equation;
    protected boolean forecastFinal;
    protected String forecastPeriodCd;
    protected String forecastPeriodName;
    protected String forecaster;
    protected String hydrologistForecastIssueDate;
    @XmlElement(nillable = true)
    protected List<BigDecimal> hydrologistForecastProbabilities;
    @XmlElement(nillable = true)
    protected List<BigDecimal> hydrologistForecastValues;
    protected String originalForecastIssueDate;
    @XmlElement(nillable = true)
    protected List<BigDecimal> originalForecastProbabilities;
    @XmlElement(nillable = true)
    protected List<BigDecimal> originalForecastValues;
    @XmlElement(nillable = true)
    protected List<String> otherAgencyCds;
    @XmlElement(nillable = true)
    protected List<BigDecimal> otherAgencyForecastValues;
    protected BigDecimal periodAverage;
    protected String publicationDate;
    protected String stationTriplet;
    protected String unitCd;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the configuration property.
     * 
     * @return
     *     possible object is
     *     {@link Configuration }
     *     
     */
    public Configuration getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Configuration }
     *     
     */
    public void setConfiguration(Configuration value) {
        this.configuration = value;
    }

    /**
     * Gets the value of the coordinatedForecastIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordinatedForecastIssueDate() {
        return coordinatedForecastIssueDate;
    }

    /**
     * Sets the value of the coordinatedForecastIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinatedForecastIssueDate(String value) {
        this.coordinatedForecastIssueDate = value;
    }

    /**
     * Gets the value of the coordinatedForecastProbabilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coordinatedForecastProbabilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordinatedForecastProbabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getCoordinatedForecastProbabilities() {
        if (coordinatedForecastProbabilities == null) {
            coordinatedForecastProbabilities = new ArrayList<BigDecimal>();
        }
        return this.coordinatedForecastProbabilities;
    }

    /**
     * Gets the value of the coordinatedForecastValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coordinatedForecastValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordinatedForecastValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getCoordinatedForecastValues() {
        if (coordinatedForecastValues == null) {
            coordinatedForecastValues = new ArrayList<BigDecimal>();
        }
        return this.coordinatedForecastValues;
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
     * Gets the value of the equation property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastEquation }
     *     
     */
    public ForecastEquation getEquation() {
        return equation;
    }

    /**
     * Sets the value of the equation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastEquation }
     *     
     */
    public void setEquation(ForecastEquation value) {
        this.equation = value;
    }

    /**
     * Gets the value of the forecastFinal property.
     * 
     */
    public boolean isForecastFinal() {
        return forecastFinal;
    }

    /**
     * Sets the value of the forecastFinal property.
     * 
     */
    public void setForecastFinal(boolean value) {
        this.forecastFinal = value;
    }

    /**
     * Gets the value of the forecastPeriodCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForecastPeriodCd() {
        return forecastPeriodCd;
    }

    /**
     * Sets the value of the forecastPeriodCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForecastPeriodCd(String value) {
        this.forecastPeriodCd = value;
    }

    /**
     * Gets the value of the forecastPeriodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForecastPeriodName() {
        return forecastPeriodName;
    }

    /**
     * Sets the value of the forecastPeriodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForecastPeriodName(String value) {
        this.forecastPeriodName = value;
    }

    /**
     * Gets the value of the forecaster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForecaster() {
        return forecaster;
    }

    /**
     * Sets the value of the forecaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForecaster(String value) {
        this.forecaster = value;
    }

    /**
     * Gets the value of the hydrologistForecastIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHydrologistForecastIssueDate() {
        return hydrologistForecastIssueDate;
    }

    /**
     * Sets the value of the hydrologistForecastIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHydrologistForecastIssueDate(String value) {
        this.hydrologistForecastIssueDate = value;
    }

    /**
     * Gets the value of the hydrologistForecastProbabilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hydrologistForecastProbabilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHydrologistForecastProbabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getHydrologistForecastProbabilities() {
        if (hydrologistForecastProbabilities == null) {
            hydrologistForecastProbabilities = new ArrayList<BigDecimal>();
        }
        return this.hydrologistForecastProbabilities;
    }

    /**
     * Gets the value of the hydrologistForecastValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hydrologistForecastValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHydrologistForecastValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getHydrologistForecastValues() {
        if (hydrologistForecastValues == null) {
            hydrologistForecastValues = new ArrayList<BigDecimal>();
        }
        return this.hydrologistForecastValues;
    }

    /**
     * Gets the value of the originalForecastIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalForecastIssueDate() {
        return originalForecastIssueDate;
    }

    /**
     * Sets the value of the originalForecastIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalForecastIssueDate(String value) {
        this.originalForecastIssueDate = value;
    }

    /**
     * Gets the value of the originalForecastProbabilities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originalForecastProbabilities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginalForecastProbabilities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getOriginalForecastProbabilities() {
        if (originalForecastProbabilities == null) {
            originalForecastProbabilities = new ArrayList<BigDecimal>();
        }
        return this.originalForecastProbabilities;
    }

    /**
     * Gets the value of the originalForecastValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originalForecastValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginalForecastValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getOriginalForecastValues() {
        if (originalForecastValues == null) {
            originalForecastValues = new ArrayList<BigDecimal>();
        }
        return this.originalForecastValues;
    }

    /**
     * Gets the value of the otherAgencyCds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherAgencyCds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherAgencyCds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOtherAgencyCds() {
        if (otherAgencyCds == null) {
            otherAgencyCds = new ArrayList<String>();
        }
        return this.otherAgencyCds;
    }

    /**
     * Gets the value of the otherAgencyForecastValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherAgencyForecastValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherAgencyForecastValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getOtherAgencyForecastValues() {
        if (otherAgencyForecastValues == null) {
            otherAgencyForecastValues = new ArrayList<BigDecimal>();
        }
        return this.otherAgencyForecastValues;
    }

    /**
     * Gets the value of the periodAverage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeriodAverage() {
        return periodAverage;
    }

    /**
     * Sets the value of the periodAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPeriodAverage(BigDecimal value) {
        this.periodAverage = value;
    }

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationDate(String value) {
        this.publicationDate = value;
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

    /**
     * Gets the value of the unitCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitCd() {
        return unitCd;
    }

    /**
     * Sets the value of the unitCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitCd(String value) {
        this.unitCd = value;
    }

}
