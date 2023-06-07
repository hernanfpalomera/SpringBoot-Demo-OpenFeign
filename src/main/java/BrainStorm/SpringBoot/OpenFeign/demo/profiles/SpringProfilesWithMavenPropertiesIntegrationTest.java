package BrainStorm.SpringBoot.OpenFeign.demo.profiles;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringProfilesWithMavenPropertiesIntegrationTest {

    @Autowired
    DatasourceConfig datasourceConfig;

    @PostConstruct
    public void init() {
        datasourceConfig.setup();
    }
}
