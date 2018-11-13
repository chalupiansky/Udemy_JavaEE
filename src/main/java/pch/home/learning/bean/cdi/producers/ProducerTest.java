package pch.home.learning.bean.cdi.producers;

import pch.home.learning.bean.cdi.producers.qualifier.Country;
import pch.home.learning.bean.cdi.producers.qualifier.Username;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

@Named
@RequestScoped
public class ProducerTest implements Serializable{

    @Inject
    private Logger logger;

    @Inject
    @Username
    private String username;

    @Inject
    @Country
    private String country;

    @Inject
    private List<String> colors;

    @Inject
    private EntityManager entityManager;

    public Logger getLogger() {
        return logger;
    }

    public String getUsername(){
        return username;
    }

    public List<String> getColors() {
        return colors;
    }

    public String getCountry() {
        return country;
    }

    public<T> T getRandomListItem(List<T> list){
        return list.get(new Random().nextInt(list.size()));
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
}
