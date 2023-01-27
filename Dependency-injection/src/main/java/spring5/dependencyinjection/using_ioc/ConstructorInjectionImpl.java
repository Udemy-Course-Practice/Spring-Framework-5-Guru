package spring5.dependencyinjection.using_ioc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service(value = "constructorInjectionImpl")
@Primary
public class ConstructorInjectionImpl implements BehaviorGeneral {
    @Override
    public String sayHello() {
        return "sayHello() ConstructorInjection";
    }
}
