
package gov.usda.nrcs.wcc.awdbWebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for predictor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="predictor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="endMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="endYearFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="predictorNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="predictorUsed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="startDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="startMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="startYearFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "predictor", propOrder = {
    "endDay",
    "endMonth",
    "endYearFlag",
    "groupNumber",
    "predictorNumber",
    "predictorUsed",
    "startDay",
    "startMonth",
    "startYearFlag",
    "stationTriplet"
})
public class Predictor {

    protected int endDay;
    protected int endMonth;
    protected String endYearFlag;
    protected int groupNumber;
    protected int predictorNumber;
    protected boolean predictorUsed;
    protected int startDay;
    protected int startMonth;
    protected String startYearFlag;
    protected String stationTriplet;

    /**
     * Gets the value of the endDay property.
     * 
     */
    public int getEndDay() {
        return endDay;
    }

    /**
     * Sets the value of the endDay property.
     * 
     */
    public void setEndDay(int value) {
        this.endDay = value;
    }

    /**
     * Gets the value of the endMonth property.
     * 
     */
    public int getEndMonth() {
        return endMonth;
    }

    /**
     * Sets the value of the endMonth property.
     * 
     */
    public void setEndMonth(int value) {
        this.endMonth = value;
    }

    /**
     * Gets the value of the endYearFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndYearFlag() {
        return endYearFlag;
    }

    /**
     * Sets the value of the endYearFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndYearFlag(String value) {
        this.endYearFlag = value;
    }

    /**
     * Gets the value of the groupNumber property.
     * 
     */
    public int getGroupNumber() {
        return groupNumber;
    }

    /**
     * Sets the value of the groupNumber property.
     * 
     */
    public void setGroupNumber(int value) {
        this.groupNumber = value;
    }

    /**
     * Gets the value of the predictorNumber property.
     * 
     */
    public int getPredictorNumber() {
        return predictorNumber;
    }

    /**
     * Sets the value of the predictorNumber property.
     * 
     */
    public void setPredictorNumber(int value) {
        this.predictorNumber = value;
    }

    /**
     * Gets the value of the predictorUsed property.
     * 
     */
    public boolean isPredictorUsed() {
        return predictorUsed;
    }

    /**
     * Sets the value of the predictorUsed property.
     * 
     */
    public void setPredictorUsed(boolean value) {
        this.predictorUsed = value;
    }

    /**
     * Gets the value of the startDay property.
     * 
     */
    public int getStartDay() {
        return startDay;
    }

    /**
     * Sets the value of the startDay property.
     * 
     */
    public void setStartDay(int value) {
        this.startDay = value;
    }

    /**
     * Gets the value of the startMonth property.
     * 
     */
    public int getStartMonth() {
        return startMonth;
    }

    /**
     * Sets the value of the startMonth property.
     * 
     */
    public void setStartMonth(int value) {
        this.startMonth = value;
    }

    /**
     * Gets the value of the startYearFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartYearFlag() {
        return startYearFlag;
    }

    /**
     * Sets the value of the startYearFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartYearFlag(String value) {
        this.startYearFlag = value;
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
