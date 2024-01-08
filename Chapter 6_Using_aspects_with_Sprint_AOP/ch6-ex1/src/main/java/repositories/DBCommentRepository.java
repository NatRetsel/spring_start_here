package repositories;

import org.springframework.stereotype.Repository;

import model.Comment;

@Repository
public class DBCommentRepository implements CommentRepository {
    
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText()); // We first simulate the action by writing to console.
    }
}
