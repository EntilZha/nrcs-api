
package gov.usda.nrcs.wcc.awdbWebService;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for forecastEquationTerm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="forecastEquationTerm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coefficient" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="dataPeriodDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataPeriodMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataYearFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stationElement" type="{http://www.wcc.nrcs.usda.gov/ns/awdbWebService}stationElement" minOccurs="0"/>
 *         &lt;element name="unitCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "forecastEquationTerm", propOrder = {
    "coefficient",
    "dataPeriodDays",
    "dataPeriodMonth",
    "dataYearFlag",
    "stationElement",
    "unitCd",
    "upstreamForecast"
})
public class ForecastEquationTerm {

    protected BigDecimal coefficient;
    protected String dataPeriodDays;
    protected String dataPeriodMonth;
    protected String dataYearFlag;
    protected StationElement stationElement;
    protected String unitCd;
    protected boolean upstreamForecast;

    /**
     * Gets the value of the coefficient property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCoefficient() {
        return coefficient;
    }

    /**
     * Sets the value of the coefficient property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCoefficient(BigDecimal value) {
        this.coefficient = value;
    }

    /**
     * Gets the value of the dataPeriodDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPeriodDays() {
        return dataPeriodDays;
    }

    /**
     * Sets the value of the dataPeriodDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPeriodDays(String value) {
        this.dataPeriodDays = value;
    }

    /**
     * Gets the value of the dataPeriodMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPeriodMonth() {
        return dataPeriodMonth;
    }

    /**
     * Sets the value of the dataPeriodMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPeriodMonth(String value) {
        this.dataPeriodMonth = value;
    }

    /**
     * Gets the value of the dataYearFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataYearFlag() {
        return dataYearFlag;
    }

    /**
     * Sets the value of the dataYearFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataYearFlag(String value) {
        this.dataYearFlag = value;
    }

    /**
     * Gets the value of the stationElement property.
     * 
     * @return
     *     possible object is
     *     {@link StationElement }
     *     
     */
    public StationElement getStationElement() {
        return stationElement;
    }

    /**
     * Sets the value of the stationElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationElement }
     *     
     */
    public void setStationElement(StationElement value) {
        this.stationElement = value;
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
