package spring5.dependencyinjection.config_bean_xml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:application_beans.xml")
public class DependencyInjectionApplication {
    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
       AnimalFactory animal = (AnimalFactory) context.getBean("animalFactory");
       System.out.println(animal.getName());
    }

}
