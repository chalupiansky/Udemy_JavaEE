package pch.home.learning.bean.cdi.qualifiers_section.impl;

import pch.home.learning.bean.cdi.qualifiers_section.Greeting;
import pch.home.learning.bean.cdi.qualifiers_section.qualifiers.Universal;

import java.io.Serializable;

@Universal(Universal.QualifierType.RECEPTIONIST)
public class UniversalReceptionist implements Greeting, Serializable {
    @Override
    public String greet(String greeting) {
        return "Universal receptionist: " + greeting;
    }
}
