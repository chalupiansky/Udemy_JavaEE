package pch.home.learning.bean.cdi.qualifiers.impl;

import pch.home.learning.bean.cdi.qualifiers.Greeting;

import javax.enterprise.context.RequestScoped;
import java.io.Serializable;

@RequestScoped
@pch.home.learning.bean.cdi.qualifiers.qualifiers.Cashier
public class Cashier implements Greeting, Serializable {

    @Override
    public String greet(String greeting) {
        return "Cashier: " + greeting;
    }
}
