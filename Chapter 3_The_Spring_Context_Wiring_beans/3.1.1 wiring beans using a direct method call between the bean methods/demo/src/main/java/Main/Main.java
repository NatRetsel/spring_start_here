package Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Parrot.Parrot;
import Person.Person;
import ProjectConfig.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class); // Gets a reference to the Person bean from the Spring context

        Parrot parrot = context.getBean(Parrot.class); // Gets a reference to the Parrot bean from the Spring context

        System.out.println("Person's name: " + person.getName()); // Prints the person's name to prove that the Person bean is in context

        System.out.println("Parrot's name: " + parrot.getName()); // Prints the parrot's name to prove that the Parrot bean is in the context

        System.out.println("Person's parrot: " + person.getParrot()); // Prints the person's parrot to prove that there's not yet a relationship between the instances
    }
    
}
