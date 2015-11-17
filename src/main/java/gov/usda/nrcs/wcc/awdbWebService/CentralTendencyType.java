
package gov.usda.nrcs.wcc.awdbWebService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for centralTendencyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="centralTendencyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AVERAGE"/>
 *     &lt;enumeration value="MEDIAN"/>
 *     &lt;enumeration value="NORMAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "centralTendencyType")
@XmlEnum
public enum CentralTendencyType {

    AVERAGE,
    MEDIAN,
    NORMAL;

    public String value() {
        return name();
    }

    public static CentralTendencyType fromValue(String v) {
        return valueOf(v);
    }

}
