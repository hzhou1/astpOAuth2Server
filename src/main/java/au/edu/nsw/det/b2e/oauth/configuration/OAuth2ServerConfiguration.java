package au.edu.nsw.det.b2e.oauth.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "au.edu.nsw.det.b2e.oauth")
public class OAuth2ServerConfiguration {
	

}