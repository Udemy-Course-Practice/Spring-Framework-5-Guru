package spring5.dependencyinjection.using_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
        ConstructorController constructorController = (ConstructorController) context.getBean("constructorController");
        constructorController.sayHello();
        PropertyController propertyController = (PropertyController) context.getBean("propertyController");
        propertyController.sayHello();
        SetterController setterController = (SetterController) context.getBean("setterController");
        setterController.sayHello();
    }

}
