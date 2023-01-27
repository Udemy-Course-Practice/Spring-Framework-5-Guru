package spring5.dependencyinjection.using_profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service(value = "behaviorGeneralImpl")
@Profile(value = "dev")
public class SetterInjectionImpl implements BehaviorGeneral {
    @Override
    public String sayHello() {
        return "sayHello() SetterInjection";
    }
}
