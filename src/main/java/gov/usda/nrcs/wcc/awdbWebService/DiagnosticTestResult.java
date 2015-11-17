
package gov.usda.nrcs.wcc.awdbWebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for diagnosticTestResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="diagnosticTestResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exception" type="{http://www.wcc.nrcs.usda.gov/ns/awdbWebService}diagnosticException" minOccurs="0"/>
 *         &lt;element name="hasSucceeded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="testDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "diagnosticTestResult", propOrder = {
    "errorMessage",
    "exception",
    "hasSucceeded",
    "testDescription"
})
public class DiagnosticTestResult {

    protected String errorMessage;
    protected DiagnosticException exception;
    protected boolean hasSucceeded;
    protected String testDescription;

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the exception property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticException }
     *     
     */
    public DiagnosticException getException() {
        return exception;
    }

    /**
     * Sets the value of the exception property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticException }
     *     
     */
    public void setException(DiagnosticException value) {
        this.exception = value;
    }

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
     * Gets the value of the testDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestDescription() {
        return testDescription;
    }

    /**
     * Sets the value of the testDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestDescription(String value) {
        this.testDescription = value;
    }

}
