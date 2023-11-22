package Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Parrot.Parrot;

@Component
public class Person {
    private String name = "Ella";

    // Using @Autowired to inject values through class fields
    @Autowired // Instruct Spring to provide a bean from its context and set it directly as the value of the field, annotated with @Autowired. This way we establish a relationship between two beans
    private Parrot parrot; // This approach is not desirable in production code as we don't have the option to make field final, thus values can be changed after initialization

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public String getParrot() {
        return this.parrot.getName();
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}
