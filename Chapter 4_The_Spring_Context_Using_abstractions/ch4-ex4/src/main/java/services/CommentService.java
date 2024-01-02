package services;

import model.Comment;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class CommentService {
    
    @Autowired
    private CommentRepository commentRepository; // fields are no longer final. Spring uses default constructor to create instances then inject

    @Autowired
    private CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        // delegates action to the dependencies
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
