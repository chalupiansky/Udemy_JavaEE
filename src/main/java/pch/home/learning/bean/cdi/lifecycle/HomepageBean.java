package pch.home.learning.bean.cdi.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.Serializable;
import java.util.Properties;

@ViewScoped
@Named("homepage")
public class HomepageBean implements Serializable{

    @PostConstruct
    public void init(){
        System.out.println("This callback is called after bean is created and" +
                " all contextual instances are injected into this class.");
    }

    public void printJNDI() throws NamingException {
        Context context = new InitialContext(); // Access point to JNDI properties stored on WAS
        Properties properties =  (Properties) context.lookup("properties/udemy/");
        String property1 = properties.getProperty("test1");
        System.out.println(property1);
    }

    @PreDestroy
    public void onDestroy(){
        System.out.println("This callback is called before this bean is destroyed by the container");
    }
}
