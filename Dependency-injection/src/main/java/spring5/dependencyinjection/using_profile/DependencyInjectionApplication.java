package spring5.dependencyinjection.using_profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    private ConstructorController constructorController;

    private SetterController setterController;

    private PropertyController propertyController;

    public DependencyInjectionApplication(ConstructorController constructorController,
                                          SetterController setterController,
                                          PropertyController propertyController) {
        this.constructorController = constructorController;
        this.setterController = setterController;
        this.propertyController = propertyController;
    }

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
        DependencyInjectionApplication dependencyInjectionApplication = (DependencyInjectionApplication) context.getBean("dependencyInjectionApplication");
        dependencyInjectionApplication.constructorController.sayHello();
        dependencyInjectionApplication.setterController.sayHello();
        dependencyInjectionApplication.propertyController.sayHello();
    }
}
