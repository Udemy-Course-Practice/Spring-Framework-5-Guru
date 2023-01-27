package spring5.dependencyinjection.using_ioc;

import org.springframework.stereotype.Service;

@Service(value = "setterInjectionImpl")
public class SetterInjectionImpl implements BehaviorGeneral {
    @Override
    public String sayHello() {
        return "sayHello() SetterInjection";
    }
}
