package repositories;

import model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment); // CommentService object needs to implement the use case.
    
} 
