package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.ProjectConfiguration;
import model.Comment;

import services.CommentService;

public class Main {
    
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        CommentService service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Natasha");

        service.publishComment(comment);

    }
}
