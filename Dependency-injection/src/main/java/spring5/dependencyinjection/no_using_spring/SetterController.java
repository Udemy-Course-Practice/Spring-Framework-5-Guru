package spring5.dependencyinjection.no_using_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

public class SetterController {

    private BehaviorGeneral behaviorGeneral;
    public void setBehaviorGeneral(BehaviorGeneral behaviorGeneral) {
        this.behaviorGeneral = behaviorGeneral;
    }

    public void sayHello(){
        System.out.println(behaviorGeneral.sayHello());
    }
}
