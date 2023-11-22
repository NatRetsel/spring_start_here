package config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Parrot.Parrot;

@Configuration // use the @Configuration annotation to define this class as a Spring configuration class.
public class ProjectConfig {
    
    @Bean // Adding the @Bean annotation instruct Spring to call this method at context initialization and add the returned value to the context
    Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p; // Spring adds to its context the Parrot instance returned by the method.
    }

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
