package ProjectConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import Parrot.Parrot;
import Person.Person;

@Configuration
public class ProjectConfig {
    
    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Person person(Parrot parrot) { // Instruct Spring to provide a bean from its context by defining a parameter for the method.
        Person p = new Person();
        p.setName("Ella");
        
        // Wiring beans using the @Bean annotated method's parameters
        // Second way to do it will be to add a parameter to the method of the corresponding type of object and rely
        // on Spring to provide us a value through that parameter.
        // When calling the method, Spring knows it has to find a parrot bean in its context and inject its value into the parameter of the 
        // person() method. (Dependency Injection) DI is an application of the IoC principle, and implies that the framework controls
        // the application at execution.
        p.setParrot(parrot); 
        return p;
    }
}
