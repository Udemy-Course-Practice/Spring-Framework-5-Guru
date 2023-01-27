package spring5.dependencyinjection.no_using_spring;

public class ConstructorInjectionImpl implements BehaviorGeneral {
    @Override
    public String sayHello() {
        return "sayHello() ConstructorInjection";
    }
}
