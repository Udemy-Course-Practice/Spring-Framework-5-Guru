package spring5.dependencyinjection.external_component_scan_bean;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import spring5.dependencyinjection.using_ioc.ConstructorController;

@SpringBootApplication
@ComponentScan(basePackages = {"spring5.dependencyinjection.external_component_scan_bean","spring5.dependencyinjection.using_ioc"})
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
        ConstructorController constructorController = (ConstructorController) context.getBean("constructorController");
        constructorController.sayHello();
    }
}
