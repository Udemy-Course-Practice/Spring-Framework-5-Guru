package spring5.dependencyinjection.config_bean_xml;

public class DogImpl implements Animal {
    @Override
    public String getName() {
        return "This is dog";
    }
}
