package pch.home.learning.bean.cdi.events;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.Serializable;

public class User implements Serializable{

    private String username;
    private String email;

    @PostConstruct
    public void init(){
        System.out.println("User init");
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("User destroy!");
    }
}

