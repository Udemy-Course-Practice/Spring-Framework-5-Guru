package spring5.dependencyinjection.scope_bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeanScopeApplicationTest {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BeanScopeApplicationTest.class, args);
        SingletonBean singletonBean1 = (SingletonBean) context.getBean("singletonBean");
        SingletonBean singletonBean2 = (SingletonBean) context.getBean("singletonBean");
        SingletonBean singletonBean3 = (SingletonBean) context.getBean("singletonBean");
        PrototypeBean prototypeBean1 = (PrototypeBean) context.getBean("prototypeBean");
        PrototypeBean prototypeBean2 = (PrototypeBean) context.getBean("prototypeBean");
        PrototypeBean prototypeBean3 = (PrototypeBean) context.getBean("prototypeBean");
        PrototypeBean prototypeBean4 = (PrototypeBean) context.getBean("prototypeBean");
    }
}
