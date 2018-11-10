package pch.home.learning.bean.cdi.scopes;

import javax.enterprise.context.ConversationScoped;
import java.io.Serializable;

/*
In this scope contextual instance is created when bean is called and destroyed when developer determine
 */
@ConversationScoped
public class ConversationScope implements Serializable{

    public int beanHashCode() {
        return this.hashCode();
    }
}
