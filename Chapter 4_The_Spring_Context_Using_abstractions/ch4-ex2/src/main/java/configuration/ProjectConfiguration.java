package configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan (basePackages = {"proxies","services", "repositories"})
public class ProjectConfiguration {
    
}
