package pch.home.learning.bean.cdi.scopes;

import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;

/*
    This scope will create single contextual instance
    of bean type, that is associated with application lifecycle.
    It means there is only one contextual instance for whole application.
    So it is essentially singleton
 */
@ApplicationScoped
public class ApplicationScope implements Serializable{

    public int beanHashCode() {
        return this.hashCode();
    }
}
