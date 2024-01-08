package aspects;

import java.util.Arrays;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    //@Around("@annotation(annotations.ToLog)")
    @AfterReturning(value = "@annotation(annotations.ToLog)",
                    returning = "returnedValue")
    public void log(Object returnedValue){


        // Calls the intercepted method
        logger.info("Method executed and returned " + returnedValue);
    }
}
