package spring5.dependencyinjection.using_profile;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service(value = "behaviorGeneralImpl")
@Profile(value = {"pro", "default"})
public class ConstructorInjectionImpl implements BehaviorGeneral {
    @Override
    public String sayHello() {
        return "sayHello() ConstructorInjection";
    }
}
