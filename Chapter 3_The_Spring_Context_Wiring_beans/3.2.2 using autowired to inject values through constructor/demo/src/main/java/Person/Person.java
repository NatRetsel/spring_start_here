package Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Parrot.Parrot;

@Component
public class Person {
    private String name = "Ella";

    
    private final Parrot parrot; 

    @Autowired // WHen Spring creates the bean of type Person, it calls the constructor annotated with @Autowired. Spring provides a bean of type Parrot from its context as value of the parameter.
    public Person(Parrot parrot) {
        this.parrot = parrot;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public String getParrot() {
        return this.parrot.getName();
    }

}
