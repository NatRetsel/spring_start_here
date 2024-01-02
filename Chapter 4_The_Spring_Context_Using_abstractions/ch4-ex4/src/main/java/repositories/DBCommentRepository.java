package repositories;

import org.springframework.stereotype.Component;

import model.Comment;

@Component
public class DBCommentRepository implements CommentRepository {
    
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText()); // We first simulate the action by writing to console.
    }
}
