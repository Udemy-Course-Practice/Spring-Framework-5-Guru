package spring5.dependencyinjection.using_spring;

import org.springframework.stereotype.Controller;

@Controller
public class ConstructorController {
    private final BehaviorGeneral behaviorGeneral;

    public ConstructorController(BehaviorGeneral behaviorGeneral) {
        this.behaviorGeneral = behaviorGeneral;
    }

    public void sayHello(){
        System.out.println(behaviorGeneral.sayHello());
    }
}
