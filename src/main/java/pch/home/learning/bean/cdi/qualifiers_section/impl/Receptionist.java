package pch.home.learning.bean.cdi.qualifiers_section.impl;

import pch.home.learning.bean.cdi.qualifiers_section.Greeting;

import javax.enterprise.context.RequestScoped;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

@RequestScoped
@pch.home.learning.bean.cdi.qualifiers_section.qualifiers.Receptionist
public class Receptionist implements Greeting, Serializable {

    @Override
    public String greet(String greeting) {
        return "Receptionist: " + greeting;
    }
}
