package ProjectConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Parrot.Parrot;
import Person.Person;


@Configuration

public class ProjectConfig {
    
    @Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean
    public Person person(Parrot parrot2) { //parameter injection to specify which bean to inject
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot2);
        return p;
    }
}
