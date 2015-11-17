
package gov.usda.nrcs.wcc.awdbWebService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for averagesData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="averagesData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beginDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="beginMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dataSetFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.wcc.nrcs.usda.gov/ns/awdbWebService}duration" minOccurs="0"/>
 *         &lt;element name="endDay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="endMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="flags" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="values" type="{http://www.w3.org/2001/XMLSchema}decimal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "averagesData", propOrder = {
    "beginDay",
    "beginMonth",
    "dataSetFlag",
    "duration",
    "endDay",
    "endMonth",
    "flags",
    "values"
})
@XmlSeeAlso({
    CentralTendencyData.class
})
public class AveragesData {

    protected int beginDay;
    protected int beginMonth;
    protected String dataSetFlag;
    @XmlSchemaType(name = "string")
    protected Duration duration;
    protected int endDay;
    protected int endMonth;
    @XmlElement(nillable = true)
    protected List<String> flags;
    @XmlElement(nillable = true)
    protected List<BigDecimal> values;

    /**
     * Gets the value of the beginDay property.
     * 
     */
    public int getBeginDay() {
        return beginDay;
    }

    /**
     * Sets the value of the beginDay property.
     * 
     */
    public void setBeginDay(int value) {
        this.beginDay = value;
    }

    /**
     * Gets the value of the beginMonth property.
     * 
     */
    public int getBeginMonth() {
        return beginMonth;
    }

    /**
     * Sets the value of the beginMonth property.
     * 
     */
    public void setBeginMonth(int value) {
        this.beginMonth = value;
    }

    /**
     * Gets the value of the dataSetFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSetFlag() {
        return dataSetFlag;
    }

    /**
     * Sets the value of the dataSetFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSetFlag(String value) {
        this.dataSetFlag = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

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
     * Gets the value of the flags property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flags property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlags().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFlags() {
        if (flags == null) {
            flags = new ArrayList<String>();
        }
        return this.flags;
    }

    /**
     * Gets the value of the values property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the values property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getValues() {
        if (values == null) {
            values = new ArrayList<BigDecimal>();
        }
        return this.values;
    }

}
