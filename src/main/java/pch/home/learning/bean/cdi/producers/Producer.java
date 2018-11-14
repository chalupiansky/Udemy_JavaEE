package pch.home.learning.bean.cdi.producers;

import pch.home.learning.bean.cdi.producers.qualifier.Country;
import pch.home.learning.bean.cdi.producers.qualifier.Username;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Producer implements Serializable {

    @Produces
    public Logger getLogger(InjectionPoint injectionPoint){
        return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
    }

    @Produces
    public List<String> colors(){
        List<String> colors = new ArrayList<>();
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("orange");
        colors.add("yellow");
        colors.add("violet");
        colors.add("grey");
        colors.add("black");
        colors.add("white");
        return colors;
    }

    @Produces
    @Username
    public String getUsername(){
        return "Pavel";
    }
    @Produces
    @Country
    public String getCountry(){
        return "CZE";
    }

    // Disposer methid is similar to @PreDestroy method, but for produced beans (@Produces)
    // So it is call before end of cdi managed bean lifecycle (before destroy)
    public void cleanUp(@Disposes @Username  String username){
        username = null;
    }
}
