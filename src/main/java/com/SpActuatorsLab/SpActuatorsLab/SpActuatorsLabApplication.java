package com.SpActuatorsLab.SpActuatorsLab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.SpActuatorsLab.SpActuatorsLab.model")
@EnableJpaRepositories("com.SpActuatorsLab.SpActuatorsLab.repository")
public class SpActuatorsLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpActuatorsLabApplication.class, args);
	}
}