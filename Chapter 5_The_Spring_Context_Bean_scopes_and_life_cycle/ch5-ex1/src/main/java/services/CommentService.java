package services;

import model.Comment;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
        // We annotate the parameter with the @Qualifier
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;
    }

    public void publishComment(Comment comment) {
        // delegates action to the dependencies
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
