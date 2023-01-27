package spring5.dependencyinjection.no_using_spring;

public class SetterInjectionImpl implements BehaviorGeneral {
    @Override
    public String sayHello() {
        return "sayHello() SetterInjection";
    }
}
