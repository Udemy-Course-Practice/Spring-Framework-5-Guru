package spring5.dependencyinjection.using_properties_file;

public class ConstructorPropertyBinding {
    private ConstructorPropertyBindingInject constructorPropertyBindingInject;

    public ConstructorPropertyBinding(ConstructorPropertyBindingInject constructorPropertyBindingInject) {
        this.constructorPropertyBindingInject = constructorPropertyBindingInject;
    }

    @Override
    public String toString() {
        return constructorPropertyBindingInject.toString();
    }
}
