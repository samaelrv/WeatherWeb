
package com.weather.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.3.1-patch-01
 * Wed Jul 28 10:13:06 IST 2021
 * Generated source version: 2.3.1-patch-01
 */

@XmlRootElement(name = "gettemperatureResponse", namespace = "http://service.weather.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gettemperatureResponse", namespace = "http://service.weather.com/")

public class GettemperatureResponse {

    @XmlElement(name = "return")
    private java.lang.Double _return;

    public java.lang.Double getReturn() {
        return this._return;
    }

    public void setReturn(java.lang.Double new_return)  {
        this._return = new_return;
    }

}

