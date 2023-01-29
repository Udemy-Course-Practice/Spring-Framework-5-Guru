package spring5.dependencyinjection.config_bean_xml;

import org.springframework.beans.factory.annotation.Autowired;

public class AnimalFactory {
    private Animal animal;

    public AnimalFactory(Animal animal) {
        this.animal = animal;
    }

    public String getName(){
       return animal.getName();
    }
}
