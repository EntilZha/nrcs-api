
package gov.usda.nrcs.wcc.awdbWebService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for configuration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configuration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="analysisType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calibrationEndYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="calibrationStartYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="componentsToRetain" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dailyForecast" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dailyForecastThreshold" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dailyForecastThresholdRelative" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dataForcedSeriallyComplete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="degreesOfFreedom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="forecastCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forecastType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forecaster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="functionArgument" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="functionCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="helperDataSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="helperElementCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="helperEndDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="helperEndMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="helperEndYearFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="helperMixedPastEndDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="helperMixedPastEndMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="helperMixedPastEndYearFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="helperMixedPastStartDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="helperMixedPastStartMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="helperMixedPastStartYearFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="helperPredictorUsed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="helperStartDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="helperStartMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="helperStartYearFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="helperStationTriplet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="helperUsedInOverlappingYears" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="helperVarianceMatchedToObserved" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="jackKnifingUsed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minimumR2ForPredictor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="minimumYearsForPredictor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mixedPastEndDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mixedPastEndMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mixedPastEndYearFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mixedPastStartDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mixedPastStartMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mixedPastStartYearFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mixedPastUsed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numYearsUsed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="optimalWeightingUsed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="overrideAverage" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="overrideStderr" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pastFlowRealtime" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="predictorGroups" type="{http://www.wcc.nrcs.usda.gov/ns/awdbWebService}predictorGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="predictors" type="{http://www.wcc.nrcs.usda.gov/ns/awdbWebService}predictor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="preprocessingConstant" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="preprocessingMultiplier" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="publicationCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TTestLimit" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="targetDataSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetElementCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetEndDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="targetEndMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="targetEndYearFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetStartDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="targetStartMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="targetStartYearFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetStationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetStationTriplet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transformErrorsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configuration", propOrder = {
    "analysisType",
    "calibrationEndYear",
    "calibrationStartYear",
    "comment",
    "componentsToRetain",
    "creationDate",
    "dailyForecast",
    "dailyForecastThreshold",
    "dailyForecastThresholdRelative",
    "dataForcedSeriallyComplete",
    "degreesOfFreedom",
    "forecastCondition",
    "forecastType",
    "forecaster",
    "functionArgument",
    "functionCd",
    "helperDataSource",
    "helperElementCd",
    "helperEndDay",
    "helperEndMonth",
    "helperEndYearFlag",
    "helperMixedPastEndDay",
    "helperMixedPastEndMonth",
    "helperMixedPastEndYearFlag",
    "helperMixedPastStartDay",
    "helperMixedPastStartMonth",
    "helperMixedPastStartYearFlag",
    "helperPredictorUsed",
    "helperStartDay",
    "helperStartMonth",
    "helperStartYearFlag",
    "helperStationTriplet",
    "helperUsedInOverlappingYears",
    "helperVarianceMatchedToObserved",
    "jackKnifingUsed",
    "key",
    "minimumR2ForPredictor",
    "minimumYearsForPredictor",
    "mixedPastEndDay",
    "mixedPastEndMonth",
    "mixedPastEndYearFlag",
    "mixedPastStartDay",
    "mixedPastStartMonth",
    "mixedPastStartYearFlag",
    "mixedPastUsed",
    "name",
    "numYearsUsed",
    "optimalWeightingUsed",
    "overrideAverage",
    "overrideStderr",
    "pastFlowRealtime",
    "predictorGroups",
    "predictors",
    "preprocessingConstant",
    "preprocessingMultiplier",
    "publicationCd",
    "tTestLimit",
    "targetDataSource",
    "targetElementCd",
    "targetEndDay",
    "targetEndMonth",
    "targetEndYearFlag",
    "targetStartDay",
    "targetStartMonth",
    "targetStartYearFlag",
    "targetStationName",
    "targetStationTriplet",
    "transformErrorsOnly"
})
public class Configuration {

    protected String analysisType;
    protected int calibrationEndYear;
    protected int calibrationStartYear;
    protected String comment;
    protected int componentsToRetain;
    protected String creationDate;
    protected boolean dailyForecast;
    protected BigDecimal dailyForecastThreshold;
    protected boolean dailyForecastThresholdRelative;
    protected boolean dataForcedSeriallyComplete;
    protected int degreesOfFreedom;
    protected String forecastCondition;
    protected String forecastType;
    protected String forecaster;
    protected BigDecimal functionArgument;
    protected String functionCd;
    protected String helperDataSource;
    protected String helperElementCd;
    protected int helperEndDay;
    protected int helperEndMonth;
    protected String helperEndYearFlag;
    protected int helperMixedPastEndDay;
    protected int helperMixedPastEndMonth;
    protected String helperMixedPastEndYearFlag;
    protected int helperMixedPastStartDay;
    protected int helperMixedPastStartMonth;
    protected String helperMixedPastStartYearFlag;
    protected boolean helperPredictorUsed;
    protected int helperStartDay;
    protected int helperStartMonth;
    protected String helperStartYearFlag;
    protected String helperStationTriplet;
    protected boolean helperUsedInOverlappingYears;
    protected boolean helperVarianceMatchedToObserved;
    protected boolean jackKnifingUsed;
    protected int key;
    protected BigDecimal minimumR2ForPredictor;
    protected int minimumYearsForPredictor;
    protected int mixedPastEndDay;
    protected int mixedPastEndMonth;
    protected String mixedPastEndYearFlag;
    protected int mixedPastStartDay;
    protected int mixedPastStartMonth;
    protected String mixedPastStartYearFlag;
    protected boolean mixedPastUsed;
    protected String name;
    protected int numYearsUsed;
    protected boolean optimalWeightingUsed;
    protected BigDecimal overrideAverage;
    protected BigDecimal overrideStderr;
    protected BigDecimal pastFlowRealtime;
    @XmlElement(nillable = true)
    protected List<PredictorGroup> predictorGroups;
    @XmlElement(nillable = true)
    protected List<Predictor> predictors;
    protected BigDecimal preprocessingConstant;
    protected BigDecimal preprocessingMultiplier;
    protected String publicationCd;
    @XmlElement(name = "TTestLimit")
    protected BigDecimal tTestLimit;
    protected String targetDataSource;
    protected String targetElementCd;
    protected int targetEndDay;
    protected int targetEndMonth;
    protected String targetEndYearFlag;
    protected int targetStartDay;
    protected int targetStartMonth;
    protected String targetStartYearFlag;
    protected String targetStationName;
    protected String targetStationTriplet;
    protected boolean transformErrorsOnly;

    /**
     * Gets the value of the analysisType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalysisType() {
        return analysisType;
    }

    /**
     * Sets the value of the analysisType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalysisType(String value) {
        this.analysisType = value;
    }

    /**
     * Gets the value of the calibrationEndYear property.
     * 
     */
    public int getCalibrationEndYear() {
        return calibrationEndYear;
    }

    /**
     * Sets the value of the calibrationEndYear property.
     * 
     */
    public void setCalibrationEndYear(int value) {
        this.calibrationEndYear = value;
    }

    /**
     * Gets the value of the calibrationStartYear property.
     * 
     */
    public int getCalibrationStartYear() {
        return calibrationStartYear;
    }

    /**
     * Sets the value of the calibrationStartYear property.
     * 
     */
    public void setCalibrationStartYear(int value) {
        this.calibrationStartYear = value;
    }

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
     * Gets the value of the componentsToRetain property.
     * 
     */
    public int getComponentsToRetain() {
        return componentsToRetain;
    }

    /**
     * Sets the value of the componentsToRetain property.
     * 
     */
    public void setComponentsToRetain(int value) {
        this.componentsToRetain = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDate(String value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the dailyForecast property.
     * 
     */
    public boolean isDailyForecast() {
        return dailyForecast;
    }

    /**
     * Sets the value of the dailyForecast property.
     * 
     */
    public void setDailyForecast(boolean value) {
        this.dailyForecast = value;
    }

    /**
     * Gets the value of the dailyForecastThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDailyForecastThreshold() {
        return dailyForecastThreshold;
    }

    /**
     * Sets the value of the dailyForecastThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDailyForecastThreshold(BigDecimal value) {
        this.dailyForecastThreshold = value;
    }

    /**
     * Gets the value of the dailyForecastThresholdRelative property.
     * 
     */
    public boolean isDailyForecastThresholdRelative() {
        return dailyForecastThresholdRelative;
    }

    /**
     * Sets the value of the dailyForecastThresholdRelative property.
     * 
     */
    public void setDailyForecastThresholdRelative(boolean value) {
        this.dailyForecastThresholdRelative = value;
    }

    /**
     * Gets the value of the dataForcedSeriallyComplete property.
     * 
     */
    public boolean isDataForcedSeriallyComplete() {
        return dataForcedSeriallyComplete;
    }

    /**
     * Sets the value of the dataForcedSeriallyComplete property.
     * 
     */
    public void setDataForcedSeriallyComplete(boolean value) {
        this.dataForcedSeriallyComplete = value;
    }

    /**
     * Gets the value of the degreesOfFreedom property.
     * 
     */
    public int getDegreesOfFreedom() {
        return degreesOfFreedom;
    }

    /**
     * Sets the value of the degreesOfFreedom property.
     * 
     */
    public void setDegreesOfFreedom(int value) {
        this.degreesOfFreedom = value;
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
     * Gets the value of the functionCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionCd() {
        return functionCd;
    }

    /**
     * Sets the value of the functionCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionCd(String value) {
        this.functionCd = value;
    }

    /**
     * Gets the value of the helperDataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelperDataSource() {
        return helperDataSource;
    }

    /**
     * Sets the value of the helperDataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelperDataSource(String value) {
        this.helperDataSource = value;
    }

    /**
     * Gets the value of the helperElementCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelperElementCd() {
        return helperElementCd;
    }

    /**
     * Sets the value of the helperElementCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelperElementCd(String value) {
        this.helperElementCd = value;
    }

    /**
     * Gets the value of the helperEndDay property.
     * 
     */
    public int getHelperEndDay() {
        return helperEndDay;
    }

    /**
     * Sets the value of the helperEndDay property.
     * 
     */
    public void setHelperEndDay(int value) {
        this.helperEndDay = value;
    }

    /**
     * Gets the value of the helperEndMonth property.
     * 
     */
    public int getHelperEndMonth() {
        return helperEndMonth;
    }

    /**
     * Sets the value of the helperEndMonth property.
     * 
     */
    public void setHelperEndMonth(int value) {
        this.helperEndMonth = value;
    }

    /**
     * Gets the value of the helperEndYearFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelperEndYearFlag() {
        return helperEndYearFlag;
    }

    /**
     * Sets the value of the helperEndYearFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelperEndYearFlag(String value) {
        this.helperEndYearFlag = value;
    }

    /**
     * Gets the value of the helperMixedPastEndDay property.
     * 
     */
    public int getHelperMixedPastEndDay() {
        return helperMixedPastEndDay;
    }

    /**
     * Sets the value of the helperMixedPastEndDay property.
     * 
     */
    public void setHelperMixedPastEndDay(int value) {
        this.helperMixedPastEndDay = value;
    }

    /**
     * Gets the value of the helperMixedPastEndMonth property.
     * 
     */
    public int getHelperMixedPastEndMonth() {
        return helperMixedPastEndMonth;
    }

    /**
     * Sets the value of the helperMixedPastEndMonth property.
     * 
     */
    public void setHelperMixedPastEndMonth(int value) {
        this.helperMixedPastEndMonth = value;
    }

    /**
     * Gets the value of the helperMixedPastEndYearFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelperMixedPastEndYearFlag() {
        return helperMixedPastEndYearFlag;
    }

    /**
     * Sets the value of the helperMixedPastEndYearFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelperMixedPastEndYearFlag(String value) {
        this.helperMixedPastEndYearFlag = value;
    }

    /**
     * Gets the value of the helperMixedPastStartDay property.
     * 
     */
    public int getHelperMixedPastStartDay() {
        return helperMixedPastStartDay;
    }

    /**
     * Sets the value of the helperMixedPastStartDay property.
     * 
     */
    public void setHelperMixedPastStartDay(int value) {
        this.helperMixedPastStartDay = value;
    }

    /**
     * Gets the value of the helperMixedPastStartMonth property.
     * 
     */
    public int getHelperMixedPastStartMonth() {
        return helperMixedPastStartMonth;
    }

    /**
     * Sets the value of the helperMixedPastStartMonth property.
     * 
     */
    public void setHelperMixedPastStartMonth(int value) {
        this.helperMixedPastStartMonth = value;
    }

    /**
     * Gets the value of the helperMixedPastStartYearFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelperMixedPastStartYearFlag() {
        return helperMixedPastStartYearFlag;
    }

    /**
     * Sets the value of the helperMixedPastStartYearFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelperMixedPastStartYearFlag(String value) {
        this.helperMixedPastStartYearFlag = value;
    }

    /**
     * Gets the value of the helperPredictorUsed property.
     * 
     */
    public boolean isHelperPredictorUsed() {
        return helperPredictorUsed;
    }

    /**
     * Sets the value of the helperPredictorUsed property.
     * 
     */
    public void setHelperPredictorUsed(boolean value) {
        this.helperPredictorUsed = value;
    }

    /**
     * Gets the value of the helperStartDay property.
     * 
     */
    public int getHelperStartDay() {
        return helperStartDay;
    }

    /**
     * Sets the value of the helperStartDay property.
     * 
     */
    public void setHelperStartDay(int value) {
        this.helperStartDay = value;
    }

    /**
     * Gets the value of the helperStartMonth property.
     * 
     */
    public int getHelperStartMonth() {
        return helperStartMonth;
    }

    /**
     * Sets the value of the helperStartMonth property.
     * 
     */
    public void setHelperStartMonth(int value) {
        this.helperStartMonth = value;
    }

    /**
     * Gets the value of the helperStartYearFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelperStartYearFlag() {
        return helperStartYearFlag;
    }

    /**
     * Sets the value of the helperStartYearFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelperStartYearFlag(String value) {
        this.helperStartYearFlag = value;
    }

    /**
     * Gets the value of the helperStationTriplet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelperStationTriplet() {
        return helperStationTriplet;
    }

    /**
     * Sets the value of the helperStationTriplet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelperStationTriplet(String value) {
        this.helperStationTriplet = value;
    }

    /**
     * Gets the value of the helperUsedInOverlappingYears property.
     * 
     */
    public boolean isHelperUsedInOverlappingYears() {
        return helperUsedInOverlappingYears;
    }

    /**
     * Sets the value of the helperUsedInOverlappingYears property.
     * 
     */
    public void setHelperUsedInOverlappingYears(boolean value) {
        this.helperUsedInOverlappingYears = value;
    }

    /**
     * Gets the value of the helperVarianceMatchedToObserved property.
     * 
     */
    public boolean isHelperVarianceMatchedToObserved() {
        return helperVarianceMatchedToObserved;
    }

    /**
     * Sets the value of the helperVarianceMatchedToObserved property.
     * 
     */
    public void setHelperVarianceMatchedToObserved(boolean value) {
        this.helperVarianceMatchedToObserved = value;
    }

    /**
     * Gets the value of the jackKnifingUsed property.
     * 
     */
    public boolean isJackKnifingUsed() {
        return jackKnifingUsed;
    }

    /**
     * Sets the value of the jackKnifingUsed property.
     * 
     */
    public void setJackKnifingUsed(boolean value) {
        this.jackKnifingUsed = value;
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
     * Gets the value of the minimumR2ForPredictor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumR2ForPredictor() {
        return minimumR2ForPredictor;
    }

    /**
     * Sets the value of the minimumR2ForPredictor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumR2ForPredictor(BigDecimal value) {
        this.minimumR2ForPredictor = value;
    }

    /**
     * Gets the value of the minimumYearsForPredictor property.
     * 
     */
    public int getMinimumYearsForPredictor() {
        return minimumYearsForPredictor;
    }

    /**
     * Sets the value of the minimumYearsForPredictor property.
     * 
     */
    public void setMinimumYearsForPredictor(int value) {
        this.minimumYearsForPredictor = value;
    }

    /**
     * Gets the value of the mixedPastEndDay property.
     * 
     */
    public int getMixedPastEndDay() {
        return mixedPastEndDay;
    }

    /**
     * Sets the value of the mixedPastEndDay property.
     * 
     */
    public void setMixedPastEndDay(int value) {
        this.mixedPastEndDay = value;
    }

    /**
     * Gets the value of the mixedPastEndMonth property.
     * 
     */
    public int getMixedPastEndMonth() {
        return mixedPastEndMonth;
    }

    /**
     * Sets the value of the mixedPastEndMonth property.
     * 
     */
    public void setMixedPastEndMonth(int value) {
        this.mixedPastEndMonth = value;
    }

    /**
     * Gets the value of the mixedPastEndYearFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMixedPastEndYearFlag() {
        return mixedPastEndYearFlag;
    }

    /**
     * Sets the value of the mixedPastEndYearFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMixedPastEndYearFlag(String value) {
        this.mixedPastEndYearFlag = value;
    }

    /**
     * Gets the value of the mixedPastStartDay property.
     * 
     */
    public int getMixedPastStartDay() {
        return mixedPastStartDay;
    }

    /**
     * Sets the value of the mixedPastStartDay property.
     * 
     */
    public void setMixedPastStartDay(int value) {
        this.mixedPastStartDay = value;
    }

    /**
     * Gets the value of the mixedPastStartMonth property.
     * 
     */
    public int getMixedPastStartMonth() {
        return mixedPastStartMonth;
    }

    /**
     * Sets the value of the mixedPastStartMonth property.
     * 
     */
    public void setMixedPastStartMonth(int value) {
        this.mixedPastStartMonth = value;
    }

    /**
     * Gets the value of the mixedPastStartYearFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMixedPastStartYearFlag() {
        return mixedPastStartYearFlag;
    }

    /**
     * Sets the value of the mixedPastStartYearFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMixedPastStartYearFlag(String value) {
        this.mixedPastStartYearFlag = value;
    }

    /**
     * Gets the value of the mixedPastUsed property.
     * 
     */
    public boolean isMixedPastUsed() {
        return mixedPastUsed;
    }

    /**
     * Sets the value of the mixedPastUsed property.
     * 
     */
    public void setMixedPastUsed(boolean value) {
        this.mixedPastUsed = value;
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
     * Gets the value of the numYearsUsed property.
     * 
     */
    public int getNumYearsUsed() {
        return numYearsUsed;
    }

    /**
     * Sets the value of the numYearsUsed property.
     * 
     */
    public void setNumYearsUsed(int value) {
        this.numYearsUsed = value;
    }

    /**
     * Gets the value of the optimalWeightingUsed property.
     * 
     */
    public boolean isOptimalWeightingUsed() {
        return optimalWeightingUsed;
    }

    /**
     * Sets the value of the optimalWeightingUsed property.
     * 
     */
    public void setOptimalWeightingUsed(boolean value) {
        this.optimalWeightingUsed = value;
    }

    /**
     * Gets the value of the overrideAverage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverrideAverage() {
        return overrideAverage;
    }

    /**
     * Sets the value of the overrideAverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverrideAverage(BigDecimal value) {
        this.overrideAverage = value;
    }

    /**
     * Gets the value of the overrideStderr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverrideStderr() {
        return overrideStderr;
    }

    /**
     * Sets the value of the overrideStderr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverrideStderr(BigDecimal value) {
        this.overrideStderr = value;
    }

    /**
     * Gets the value of the pastFlowRealtime property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPastFlowRealtime() {
        return pastFlowRealtime;
    }

    /**
     * Sets the value of the pastFlowRealtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPastFlowRealtime(BigDecimal value) {
        this.pastFlowRealtime = value;
    }

    /**
     * Gets the value of the predictorGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predictorGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredictorGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PredictorGroup }
     * 
     * 
     */
    public List<PredictorGroup> getPredictorGroups() {
        if (predictorGroups == null) {
            predictorGroups = new ArrayList<PredictorGroup>();
        }
        return this.predictorGroups;
    }

    /**
     * Gets the value of the predictors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predictors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredictors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Predictor }
     * 
     * 
     */
    public List<Predictor> getPredictors() {
        if (predictors == null) {
            predictors = new ArrayList<Predictor>();
        }
        return this.predictors;
    }

    /**
     * Gets the value of the preprocessingConstant property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreprocessingConstant() {
        return preprocessingConstant;
    }

    /**
     * Sets the value of the preprocessingConstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreprocessingConstant(BigDecimal value) {
        this.preprocessingConstant = value;
    }

    /**
     * Gets the value of the preprocessingMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPreprocessingMultiplier() {
        return preprocessingMultiplier;
    }

    /**
     * Sets the value of the preprocessingMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPreprocessingMultiplier(BigDecimal value) {
        this.preprocessingMultiplier = value;
    }

    /**
     * Gets the value of the publicationCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicationCd() {
        return publicationCd;
    }

    /**
     * Sets the value of the publicationCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicationCd(String value) {
        this.publicationCd = value;
    }

    /**
     * Gets the value of the tTestLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTTestLimit() {
        return tTestLimit;
    }

    /**
     * Sets the value of the tTestLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTTestLimit(BigDecimal value) {
        this.tTestLimit = value;
    }

    /**
     * Gets the value of the targetDataSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetDataSource() {
        return targetDataSource;
    }

    /**
     * Sets the value of the targetDataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetDataSource(String value) {
        this.targetDataSource = value;
    }

    /**
     * Gets the value of the targetElementCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetElementCd() {
        return targetElementCd;
    }

    /**
     * Sets the value of the targetElementCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetElementCd(String value) {
        this.targetElementCd = value;
    }

    /**
     * Gets the value of the targetEndDay property.
     * 
     */
    public int getTargetEndDay() {
        return targetEndDay;
    }

    /**
     * Sets the value of the targetEndDay property.
     * 
     */
    public void setTargetEndDay(int value) {
        this.targetEndDay = value;
    }

    /**
     * Gets the value of the targetEndMonth property.
     * 
     */
    public int getTargetEndMonth() {
        return targetEndMonth;
    }

    /**
     * Sets the value of the targetEndMonth property.
     * 
     */
    public void setTargetEndMonth(int value) {
        this.targetEndMonth = value;
    }

    /**
     * Gets the value of the targetEndYearFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetEndYearFlag() {
        return targetEndYearFlag;
    }

    /**
     * Sets the value of the targetEndYearFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetEndYearFlag(String value) {
        this.targetEndYearFlag = value;
    }

    /**
     * Gets the value of the targetStartDay property.
     * 
     */
    public int getTargetStartDay() {
        return targetStartDay;
    }

    /**
     * Sets the value of the targetStartDay property.
     * 
     */
    public void setTargetStartDay(int value) {
        this.targetStartDay = value;
    }

    /**
     * Gets the value of the targetStartMonth property.
     * 
     */
    public int getTargetStartMonth() {
        return targetStartMonth;
    }

    /**
     * Sets the value of the targetStartMonth property.
     * 
     */
    public void setTargetStartMonth(int value) {
        this.targetStartMonth = value;
    }

    /**
     * Gets the value of the targetStartYearFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetStartYearFlag() {
        return targetStartYearFlag;
    }

    /**
     * Sets the value of the targetStartYearFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetStartYearFlag(String value) {
        this.targetStartYearFlag = value;
    }

    /**
     * Gets the value of the targetStationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetStationName() {
        return targetStationName;
    }

    /**
     * Sets the value of the targetStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetStationName(String value) {
        this.targetStationName = value;
    }

    /**
     * Gets the value of the targetStationTriplet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetStationTriplet() {
        return targetStationTriplet;
    }

    /**
     * Sets the value of the targetStationTriplet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetStationTriplet(String value) {
        this.targetStationTriplet = value;
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

}
