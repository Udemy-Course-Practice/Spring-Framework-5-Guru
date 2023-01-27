package spring5.dependencyinjection.no_using_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

public class PropertyController {

    public BehaviorGeneral behaviorGeneral;
    public void sayHello(){
        System.out.println(behaviorGeneral.sayHello());
    }
}
