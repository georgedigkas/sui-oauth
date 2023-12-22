package nl.digkas.oauthresourceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableResourceServer
public class OauthResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthResourceServerApplication.class, args);
	}

}
