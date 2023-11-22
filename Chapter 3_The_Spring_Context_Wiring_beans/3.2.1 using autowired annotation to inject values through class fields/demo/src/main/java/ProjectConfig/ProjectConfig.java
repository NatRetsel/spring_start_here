package ProjectConfig;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"Person","Parrot"})
public class ProjectConfig {
    
}
