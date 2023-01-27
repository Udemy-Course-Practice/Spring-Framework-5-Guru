package spring5.dependencyinjection.no_using_spring;

import org.springframework.stereotype.Component;

public class BehaviorImpl implements BehaviorGeneral {
    @Override
    public String sayHello() {
        return "Hello";
    }
}
