package spring5.dependencyinjection.using_profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyController {
    @Autowired
    private BehaviorGeneral behaviorGeneral;
    public void sayHello(){
        System.out.println(behaviorGeneral.sayHello());
    }
}
