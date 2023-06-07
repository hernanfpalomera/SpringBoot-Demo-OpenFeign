package BrainStorm.SpringBoot.OpenFeign.demo.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class DefaultDatasourceConfig {
    public void setup() {
        System.out.println("Setting up datasource for DEFAULT environment. ");
    }
}