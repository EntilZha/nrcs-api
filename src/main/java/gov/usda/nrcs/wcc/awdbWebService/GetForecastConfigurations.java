
package gov.usda.nrcs.wcc.awdbWebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getForecastConfigurations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getForecastConfigurations">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="forecaster" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getForecastConfigurations", propOrder = {
    "forecaster"
})
public class GetForecastConfigurations {

    @XmlElement(required = true)
    protected String forecaster;

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

}
