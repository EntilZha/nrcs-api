
package gov.usda.nrcs.wcc.awdbWebService;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dataSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OBSERVED"/>
 *     &lt;enumeration value="DERIVED"/>
 *     &lt;enumeration value="INTERPRETED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dataSource")
@XmlEnum
public enum DataSource {

    OBSERVED,
    DERIVED,
    INTERPRETED;

    public String value() {
        return name();
    }

    public static DataSource fromValue(String v) {
        return valueOf(v);
    }

}
