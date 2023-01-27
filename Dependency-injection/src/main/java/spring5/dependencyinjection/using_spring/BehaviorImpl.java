package spring5.dependencyinjection.using_spring;

import org.springframework.stereotype.Component;

@Component
public class BehaviorImpl implements BehaviorGeneral{
    @Override
    public String sayHello() {
        return "Hello";
    }
}
