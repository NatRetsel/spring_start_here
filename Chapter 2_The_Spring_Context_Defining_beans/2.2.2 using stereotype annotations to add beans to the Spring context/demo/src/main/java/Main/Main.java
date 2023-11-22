package Main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Parrot.Parrot;
import config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        // creates an instance of the Spring context and using the configuration class thatreturns the object instances
        // we want to add to the context.
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        
        
        Parrot p = context.getBean(Parrot.class); 
        System.out.println(p); // prints the default String representation of the instance taken from the Spring context
        System.out.println(p.getName()); 

        
    }
}
