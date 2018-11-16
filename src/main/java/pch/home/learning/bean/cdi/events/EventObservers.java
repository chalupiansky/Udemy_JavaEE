package pch.home.learning.bean.cdi.events;

import javax.annotation.Priority;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.ObservesAsync;
import javax.enterprise.event.Reception;
import javax.enterprise.event.TransactionPhase;
import java.io.Serializable;

@RequestScoped
public class EventObservers implements Serializable{

    public void observerLogin(@Observes @LoginData EventData data){
        System.out.println("User: " + data.getUsername() + " with mail: " + data.getEmail() + " was registred.");
    }

    public void observerRegistration(@Observes EventData eventData){
        System.out.println("Registration of: " + eventData.getUsername() + " was successfull");
    }

    public void observeJoiningClub(@Observes EventData eventData){
        System.out.println("User: " + eventData.getUsername() + " joined our club");
    }

    // Called only when contextual instance of this bean exists and should be invoked during "after completion" phase of transaction
    public void conditionalObserver(@Observes (notifyObserver = Reception.IF_EXISTS, during = TransactionPhase.AFTER_COMPLETION) EventData eventData){
        System.out.println("Conditional observer");
    }

    public void asyncObserver(@ObservesAsync EventData eventData){
        System.out.println("Async");
    }

    // PRIORITIZED OBSERVER (lower the number, higher the priority)
    public void greetingObserver1(@Observes @Priority(1) String greeting) {
        System.out.println(greeting);
    }

    public void greetingObserver2(@Observes @Priority(2) String greeting) {
        System.out.println(greeting);
    }

    public void greetingObserver3(@Observes @Priority(3) String greeting) {
        System.out.println(greeting);
    }
}
