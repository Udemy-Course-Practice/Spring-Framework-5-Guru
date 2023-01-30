package spring5.dependencyinjection.using_properties_file;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
@ConstructorBinding
@ConfigurationProperties(value = "constructor.property")
public class ConstructorPropertyBindingInject {

    private String username;
    private String password;

    @Value("${common_property}")
    private String common;

    public ConstructorPropertyBindingInject(String username, String password, String common) {
        this.username = username;
        this.password = password;
        this.common = common;
    }

    @Override
    public String toString() {
        return "ConstructorPropertyBindingInject{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", common='" + common + '\'' +
                '}';
    }
}
