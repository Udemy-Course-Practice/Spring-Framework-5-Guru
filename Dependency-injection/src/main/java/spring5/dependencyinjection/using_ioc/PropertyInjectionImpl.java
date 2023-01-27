package spring5.dependencyinjection.using_ioc;

import org.springframework.stereotype.Service;

@Service(value = "propertyInjectionImpl")
public class PropertyInjectionImpl implements BehaviorGeneral {
    @Override
    public String sayHello() {
        return "sayHello() PropertyInjection";
    }
}
