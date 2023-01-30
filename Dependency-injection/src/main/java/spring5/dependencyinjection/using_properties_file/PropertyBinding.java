package spring5.dependencyinjection.using_properties_file;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(value = "custom.property")
public class PropertyBinding {
    private String username;
    private String password;

    @Value("${common_property}")
    private String common;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "PropertyBinding{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", common='" + common + '\'' +
                '}';
    }
}
