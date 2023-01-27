package spring5.dependencyinjection.no_using_spring;

import org.springframework.stereotype.Controller;

public class ConstructorController {

    private final BehaviorGeneral behaviorGeneral;

    public ConstructorController(BehaviorGeneral behaviorGeneral) {
        this.behaviorGeneral = behaviorGeneral;
    }

    public void sayHello(){
        System.out.println(behaviorGeneral.sayHello());
    }
}
