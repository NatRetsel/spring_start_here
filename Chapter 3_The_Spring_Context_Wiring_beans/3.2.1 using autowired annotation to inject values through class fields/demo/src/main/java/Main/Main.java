package Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Person.Person;
import ProjectConfig.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person p = context.getBean(Person.class);
        System.out.println("Person's name: " + p.getName());
        System.out.println("Person's parrot: " + p.getParrot());
    }
    
}
