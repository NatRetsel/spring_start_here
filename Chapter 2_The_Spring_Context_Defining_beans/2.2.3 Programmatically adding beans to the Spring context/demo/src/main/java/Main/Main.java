package Main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.function.Supplier;

import Parrot.Parrot;
import config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        // creates an instance of the Spring context and using the configuration class thatreturns the object instances
        // we want to add to the context.
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot x = new Parrot(); // Create the instance we want to add to the Spring context
        x.setName("Kiki");
        
        Supplier<Parrot>parrotSupplier = () -> x; // Define a supplier to return this instance

        context.registerBean("parrot1", Parrot.class, parrotSupplier); // call registerBean() method to add instance to the Spring context.
        Parrot p = context.getBean(Parrot.class); // To verify
        System.out.println(p); // prints the default String representation of the instance taken from the Spring context
        System.out.println(p.getName()); 

        
    }
}
