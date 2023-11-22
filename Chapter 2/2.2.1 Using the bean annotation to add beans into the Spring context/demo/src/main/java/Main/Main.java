package Main;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Parrot.Parrot;
import config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        // creates an instance of the Spring context and using the configuration class thatreturns the object instances
        // we want to add to the context.
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        
        Parrot p = context.getBean(Parrot.class); // Gets a reference of a bean of type Parrot from the Spring context by type
        System.out.println(p.getName());

        String s = context.getBean(String.class);
        System.out.println(s);

        Integer n = context.getBean(Integer.class);
        System.out.println(n);
    }
}
