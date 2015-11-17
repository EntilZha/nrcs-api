
package gov.usda.nrcs.wcc.awdbWebService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unitSystem.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="unitSystem">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENGLISH"/>
 *     &lt;enumeration value="LAST_COLLECTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "unitSystem")
@XmlEnum
public enum UnitSystem {

    ENGLISH,
    LAST_COLLECTED;

    public String value() {
        return name();
    }

    public static UnitSystem fromValue(String v) {
        return valueOf(v);
    }

}
