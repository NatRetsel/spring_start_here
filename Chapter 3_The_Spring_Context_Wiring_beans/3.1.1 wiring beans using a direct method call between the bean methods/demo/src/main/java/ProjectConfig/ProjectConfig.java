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
    public Person person() {
        Person p = new Person();
        p.setName("Ella");
        
        // Wiring beans using a direct method call between the @Bean methods
        // first way to establish relationship between two instances is to call one method from another in the configuration class.
        // Spring is smart enough to understand we want to refer to the parrot bean in its context. It controls how the methods
        // are called and can apply logic above the method call.
        // If the parrot bean already exists in the context, then instead of calling the parrot() method, Spring will directly take the
        // instance from its context. If the parrot bean does not exist yet in the context, Spring calls the parrot() method and
        // returns the bean.
        // We can test this behavior by adding a no args constructor in Parrot class printing some message to the console. It will print
        // only once.
        p.setParrot(parrot()); 
        return p;
    }
}
