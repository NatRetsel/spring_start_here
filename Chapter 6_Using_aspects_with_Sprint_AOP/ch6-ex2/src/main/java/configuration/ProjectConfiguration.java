package configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan (basePackages = {"services", "aspects"})
@EnableAspectJAutoProxy
public class ProjectConfiguration {
    
}
