package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import services.CommentService;

@Configuration
public class ProjectConfiguration {
    
    @Bean
    public CommentService commentService() {
        return new CommentService(null, null);
    }
}
