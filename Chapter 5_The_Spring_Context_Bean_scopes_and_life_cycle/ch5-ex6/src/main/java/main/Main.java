package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.ProjectConfiguration;
import services.CommentService;
import services.UserService;


public class Main {
    
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        CommentService cs1 = context.getBean(CommentService.class);
        UserService us2 = context.getBean(UserService.class);

        boolean b1 = cs1.getCommentRepository() == us2.getCommentRepository();
        System.out.println(b1);
        
    }
}
