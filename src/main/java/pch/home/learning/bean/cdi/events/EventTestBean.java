package pch.home.learning.bean.cdi.events;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@RequestScoped
public class EventTestBean implements Serializable {

    @Inject
    private User user;

    @Inject
    @LoginData
    private Event<EventData> loginEvent;

    @Inject
    private Event<EventData> registrationAndJoinEvent;

    @Inject
    private Event<EventData> asyncEvent;

    @Inject
    private  Event<String> greetingEvent;



    public void login(){
        EventData eventData = new EventData(user.getUsername(), user.getEmail());

        registrationAndJoinEvent.fire(eventData);

        // All simple observers plus login
        loginEvent.fire(eventData);

        // need Java EE 8
        // asyncEvent.fireAsync(eventData);

        greetingEvent.fire("Hello");


    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
