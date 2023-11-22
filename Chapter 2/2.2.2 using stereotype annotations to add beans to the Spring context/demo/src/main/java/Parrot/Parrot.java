package Parrot;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

// We add the @Component annotation above the class for which we need to have an instance in the Spring context.
// When doing so, we mark the class as a component. When the app creates the Spring context, Spring creates an instance
// of the class marked as a component and adds that instance to its context.
// We then need to tell Spring it needs to search for classes annotated with stereotype annotations in our configuration class.

@Component 
public class Parrot {
    private String name;

    // Using @PostConstruct to manage the instance after its creation
    // Spring borrows the @PostConstruct annotation from Java EE. We can also use this annotation with Spring beans to specify a set of 
    // instructions Spring executes after the bean creation. Just define a method in the component class and annotate with @PostConstruct
    @PostConstruct
    public void init() {
        this.name = "Kiki";
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }
}
