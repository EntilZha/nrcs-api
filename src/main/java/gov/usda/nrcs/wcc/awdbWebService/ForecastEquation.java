
package gov.usda.nrcs.wcc.awdbWebService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for forecastEquation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="forecastEquation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elementCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="equationTerms" type="{http://www.wcc.nrcs.usda.gov/ns/awdbWebService}forecastEquationTerm" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="footnotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forecastCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forecastPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forecastType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="function" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="functionArgument" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="interceptConstant" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxOfRecord" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="minOfRecord" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="monthlyCorrelationCoefficients" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="monthlyStderrValues" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publicationMonthsAndDays" type="{http://www.wcc.nrcs.usda.gov/ns/awdbWebService}monthAndDay" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="published" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="stationTriplet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transformErrorsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "forecastEquation", propOrder = {
    "comment",
    "dataSource",
    "elementCd",
    "equationTerms",
    "footnotes",
    "forecastCondition",
    "forecastPeriod",
    "forecastType",
    "function",
    "functionArgument",
    "interceptConstant",
    "key",
    "maxOfRecord",
    "minOfRecord",
    "monthlyCorrelationCoefficients",
    "monthlyStderrValues",
    "name",
    "publicationMonthsAndDays",
    "published",
    "stationTriplet",
    "transformErrorsOnly",
    "unitCd"
})
public class ForecastEquation {

    protected String comment;
    protected String dataSource;
    protected String elementCd;
    @XmlElement(nillable = true)
    protected List<ForecastEquationTerm> equationTerms;
    protected String footnotes;
    protected String forecastCondition;
    protected String forecastPeriod;
    protected String forecastType;
    protected String function;
    protected BigDecimal functionArgument;
    protected BigDecimal interceptConstant;
    protected int key;
    protected BigDecimal maxOfRecord;
    protected BigDecimal minOfRecord;
    @XmlElement(nillable = true)
    protected List<BigDecimal> monthlyCorrelationCoefficients;
    @XmlElement(nillable = true)
    protected List<BigDecimal> monthlyStderrValues;
    protected String name;
    @XmlElement(nillable = true)
    protected List<MonthAndDay> publicationMonthsAndDays;
    protected boolean published;
    protected String stationTriplet;
    protected boolean transformErrorsOnly;
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
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
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
     * Gets the value of the equationTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equationTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquationTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForecastEquationTerm }
     * 
     * 
     */
    public List<ForecastEquationTerm> getEquationTerms() {
        if (equationTerms == null) {
            equationTerms = new ArrayList<ForecastEquationTerm>();
        }
        return this.equationTerms;
    }

    /**
     * Gets the value of the footnotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFootnotes() {
        return footnotes;
    }

    /**
     * Sets the value of the footnotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFootnotes(String value) {
        this.footnotes = value;
    }

    /**
     * Gets the value of the forecastCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForecastCondition() {
        return forecastCondition;
    }

    /**
     * Sets the value of the forecastCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForecastCondition(String value) {
        this.forecastCondition = value;
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
     * Gets the value of the forecastType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForecastType() {
        return forecastType;
    }

    /**
     * Sets the value of the forecastType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForecastType(String value) {
        this.forecastType = value;
    }

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunction(String value) {
        this.function = value;
    }

    /**
     * Gets the value of the functionArgument property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFunctionArgument() {
        return functionArgument;
    }

    /**
     * Sets the value of the functionArgument property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFunctionArgument(BigDecimal value) {
        this.functionArgument = value;
    }

    /**
     * Gets the value of the interceptConstant property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInterceptConstant() {
        return interceptConstant;
    }

    /**
     * Sets the value of the interceptConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInterceptConstant(BigDecimal value) {
        this.interceptConstant = value;
    }

    /**
     * Gets the value of the key property.
     * 
     */
    public int getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     */
    public void setKey(int value) {
        this.key = value;
    }

    /**
     * Gets the value of the maxOfRecord property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxOfRecord() {
        return maxOfRecord;
    }

    /**
     * Sets the value of the maxOfRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxOfRecord(BigDecimal value) {
        this.maxOfRecord = value;
    }

    /**
     * Gets the value of the minOfRecord property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinOfRecord() {
        return minOfRecord;
    }

    /**
     * Sets the value of the minOfRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinOfRecord(BigDecimal value) {
        this.minOfRecord = value;
    }

    /**
     * Gets the value of the monthlyCorrelationCoefficients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monthlyCorrelationCoefficients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonthlyCorrelationCoefficients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getMonthlyCorrelationCoefficients() {
        if (monthlyCorrelationCoefficients == null) {
            monthlyCorrelationCoefficients = new ArrayList<BigDecimal>();
        }
        return this.monthlyCorrelationCoefficients;
    }

    /**
     * Gets the value of the monthlyStderrValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monthlyStderrValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonthlyStderrValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getMonthlyStderrValues() {
        if (monthlyStderrValues == null) {
            monthlyStderrValues = new ArrayList<BigDecimal>();
        }
        return this.monthlyStderrValues;
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
     * Gets the value of the publicationMonthsAndDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicationMonthsAndDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicationMonthsAndDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonthAndDay }
     * 
     * 
     */
    public List<MonthAndDay> getPublicationMonthsAndDays() {
        if (publicationMonthsAndDays == null) {
            publicationMonthsAndDays = new ArrayList<MonthAndDay>();
        }
        return this.publicationMonthsAndDays;
    }

    /**
     * Gets the value of the published property.
     * 
     */
    public boolean isPublished() {
        return published;
    }

    /**
     * Sets the value of the published property.
     * 
     */
    public void setPublished(boolean value) {
        this.published = value;
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
     * Gets the value of the transformErrorsOnly property.
     * 
     */
    public boolean isTransformErrorsOnly() {
        return transformErrorsOnly;
    }

    /**
     * Sets the value of the transformErrorsOnly property.
     * 
     */
    public void setTransformErrorsOnly(boolean value) {
        this.transformErrorsOnly = value;
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
