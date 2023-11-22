package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration // use the @Configuration annotation to define this class as a Spring configuration class.
@ComponentScan(basePackages = "Parrot") // tells Spring it needs to search for classes annotated with stereotype annotations and where to look for it. We enumerate the packages where we defined the classes with the stereotype annotations.
public class ProjectConfig {
    // do not need methods anymore the define the beans.
}
