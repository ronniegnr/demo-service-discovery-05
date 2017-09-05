package bd.com.ronnie.demodiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DemoDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDiscoveryServerApplication.class, args);
	}
}
