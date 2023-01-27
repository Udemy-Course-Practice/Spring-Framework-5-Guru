package spring5.dependencyinjection.using_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterController {

    private BehaviorGeneral behaviorGeneral;
    @Autowired
    public void setBehaviorGeneral(BehaviorGeneral behaviorGeneral) {
        this.behaviorGeneral = behaviorGeneral;
    }

    public void sayHello(){
        System.out.println(behaviorGeneral.sayHello());
    }
}
