package pch.home.learning.bean.cdi.stereotypes;


import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Stereotype;
import javax.inject.Named;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Stereotype
@Named
@RequestScoped
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface WebRequest {
}
