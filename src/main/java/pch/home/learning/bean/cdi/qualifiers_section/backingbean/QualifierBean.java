package pch.home.learning.bean.cdi.qualifiers_section.backingbean;

import pch.home.learning.bean.cdi.qualifiers_section.qualifiers.Cashier;
import pch.home.learning.bean.cdi.qualifiers_section.qualifiers.Receptionist;
import pch.home.learning.bean.cdi.qualifiers_section.Greeting;
import pch.home.learning.bean.cdi.qualifiers_section.qualifiers.Universal;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named("qualifierTestBean")
@ViewScoped
public class QualifierBean implements Serializable {

    @Inject
    @Cashier
    private Greeting cashierGreeting;

    @Inject
    @Receptionist
    private Greeting receptionistGreeting;

    @Inject
    @Universal(value = Universal.QualifierType.CASHIER)
    private Greeting universalCashierGreeting;

    @Inject
    @Universal(Universal.QualifierType.RECEPTIONIST)
    private Greeting universalReceptionistGreeting;


    public Greeting getCashierGreeting() {
        return cashierGreeting;
    }

    public Greeting getReceptionistGreeting() {
        return receptionistGreeting;
    }

    public Greeting getUniversalCashierGreeting() {
        return universalCashierGreeting;
    }

    public Greeting getUniversalReceptionistGreeting() {
        return universalReceptionistGreeting;
    }
}
