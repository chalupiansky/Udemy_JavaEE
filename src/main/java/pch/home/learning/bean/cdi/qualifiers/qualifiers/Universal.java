package pch.home.learning.bean.cdi.qualifiers.qualifiers;

import javax.inject.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
public @interface Universal {

    QualifierType value();

    public enum QualifierType{
        RECEPTIONIST, CASHIER
    }

}
