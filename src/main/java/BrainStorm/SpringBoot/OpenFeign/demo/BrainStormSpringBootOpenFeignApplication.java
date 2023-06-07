package BrainStorm.SpringBoot.OpenFeign.demo;

import BrainStorm.SpringBoot.OpenFeign.demo.profiles.DatasourceConfig;
import BrainStorm.SpringBoot.OpenFeign.demo.profiles.SpringProfilesWithMavenPropertiesIntegrationTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableFeignClients
public class BrainStormSpringBootOpenFeignApplication {



	public static void main(String[] args) {
		SpringApplication.run(BrainStormSpringBootOpenFeignApplication.class, args);
	}

}
