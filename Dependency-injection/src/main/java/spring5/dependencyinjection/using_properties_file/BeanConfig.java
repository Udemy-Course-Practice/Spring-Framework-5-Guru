package spring5.dependencyinjection.using_properties_file;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:custom_property.properties")
@EnableConfigurationProperties(ConstructorPropertyBindingInject.class)
public class BeanConfig {

    @Bean
    @Autowired
    public ConstructorPropertyBinding constructorPropertyBinding(ConstructorPropertyBindingInject constructorPropertyBindingInject){
        return new ConstructorPropertyBinding(constructorPropertyBindingInject);
    }
}
