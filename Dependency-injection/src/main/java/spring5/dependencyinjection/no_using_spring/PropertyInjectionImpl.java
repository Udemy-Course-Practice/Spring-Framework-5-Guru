package spring5.dependencyinjection.no_using_spring;

public class PropertyInjectionImpl implements BehaviorGeneral {
    @Override
    public String sayHello() {
        return "sayHello() PropertyInjection";
    }
}
