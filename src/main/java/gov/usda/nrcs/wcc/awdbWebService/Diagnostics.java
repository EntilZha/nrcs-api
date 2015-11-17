
package gov.usda.nrcs.wcc.awdbWebService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for diagnostics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="diagnostics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hasSucceeded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="testResults" type="{http://www.wcc.nrcs.usda.gov/ns/awdbWebService}diagnosticTestResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "diagnostics", propOrder = {
    "hasSucceeded",
    "testResults"
})
public class Diagnostics {

    protected boolean hasSucceeded;
    @XmlElement(nillable = true)
    protected List<DiagnosticTestResult> testResults;

    /**
     * Gets the value of the hasSucceeded property.
     * 
     */
    public boolean isHasSucceeded() {
        return hasSucceeded;
    }

    /**
     * Sets the value of the hasSucceeded property.
     * 
     */
    public void setHasSucceeded(boolean value) {
        this.hasSucceeded = value;
    }

    /**
     * Gets the value of the testResults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testResults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestResults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiagnosticTestResult }
     * 
     * 
     */
    public List<DiagnosticTestResult> getTestResults() {
        if (testResults == null) {
            testResults = new ArrayList<DiagnosticTestResult>();
        }
        return this.testResults;
    }

}
