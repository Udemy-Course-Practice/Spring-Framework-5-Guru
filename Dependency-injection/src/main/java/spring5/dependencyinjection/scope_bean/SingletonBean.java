package spring5.dependencyinjection.scope_bean;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("Create new instance SingletonBean");
    }
}
