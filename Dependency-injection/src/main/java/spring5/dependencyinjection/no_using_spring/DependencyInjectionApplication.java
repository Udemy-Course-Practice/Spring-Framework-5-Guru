package spring5.dependencyinjection.no_using_spring;


import spring5.dependencyinjection.no_using_spring.ConstructorController;


public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ConstructorController constructorController = new ConstructorController(new ConstructorInjectionImpl());
        constructorController.sayHello();
        PropertyController propertyController = new PropertyController();
        propertyController.behaviorGeneral = new PropertyInjectionImpl();
        propertyController.sayHello();
        SetterController setterController = new SetterController();
        setterController.setBehaviorGeneral(new SetterInjectionImpl());
        setterController.sayHello();
    }

}
