package bd.com.ronnie.demodiscoveryclient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoDiscoveryClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoDiscoveryClient1Application.class, args);
	}
}
