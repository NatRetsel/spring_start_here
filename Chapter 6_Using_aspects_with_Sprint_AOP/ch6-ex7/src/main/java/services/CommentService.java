package services;

import model.Comment;


import java.util.logging.Logger;


import org.springframework.stereotype.Service;

import annotations.ToLog;

@Service
public class CommentService {
    
    // Using a logger object to log a message in the app's console everytime someone calls the use case
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToLog
    public void publishComment(Comment comment) {
        logger.info("Publishing comment:" + comment.getText());
    }

}
