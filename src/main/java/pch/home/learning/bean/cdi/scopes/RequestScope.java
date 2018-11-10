package pch.home.learning.bean.cdi.scopes;

import javax.enterprise.context.RequestScoped;
import java.io.Serializable;

/*
  If it is injected into some bean, every time there is http request
  the new contextual instance of request scope bean is created and when
  the http request is handled and response is given, contextual instance
  is destroyed. All of it is automatically done by CDI container
*/
@RequestScoped
public class RequestScope implements Serializable{

    public int beanHashCode() {
        return this.hashCode();
    }
}
