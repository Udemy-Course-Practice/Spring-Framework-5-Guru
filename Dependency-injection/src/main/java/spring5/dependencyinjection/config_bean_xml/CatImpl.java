package spring5.dependencyinjection.config_bean_xml;

public class CatImpl implements Animal {
    @Override
    public String getName() {
        return "This is Cat";
    }
}
