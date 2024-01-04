package proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import model.Comment;

@Component
@Qualifier("EMAIL") // naming this implementation "EMAIL"
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
