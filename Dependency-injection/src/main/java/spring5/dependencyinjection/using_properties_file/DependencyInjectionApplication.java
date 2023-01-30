package spring5.dependencyinjection.using_properties_file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spring5.dependencyinjection.using_profile.ConstructorController;
import spring5.dependencyinjection.using_profile.PropertyController;
import spring5.dependencyinjection.using_profile.SetterController;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
        PropertyBinding propertyBinding = (PropertyBinding) context.getBean("propertyBinding");
        System.out.println(propertyBinding.toString());

        ConstructorPropertyBinding constructorPropertyBinding = (ConstructorPropertyBinding) context.getBean("constructorPropertyBinding");
        System.out.println(constructorPropertyBinding.toString());
    }
}
