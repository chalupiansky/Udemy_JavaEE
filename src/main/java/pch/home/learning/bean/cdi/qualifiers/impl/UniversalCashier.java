package pch.home.learning.bean.cdi.qualifiers.impl;

import pch.home.learning.bean.cdi.qualifiers.Greeting;
import pch.home.learning.bean.cdi.qualifiers.qualifiers.Universal;

import java.io.Serializable;

@Universal(value = Universal.QualifierType.CASHIER)
public class UniversalCashier implements Greeting, Serializable {
    @Override
    public String greet(String greeting) {
        return "Universal cashier: " + greeting;
    }
}
