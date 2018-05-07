package configserver.tollstationsystemconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TollStationSystemConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(TollStationSystemConfigserverApplication.class, args);
	}
}
