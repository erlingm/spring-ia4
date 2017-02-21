package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Erling Molde on 21.02.2017.
 */
@Aspect
public class Audience {

    @Pointcut("execution(* concert.Performance.perform(..)) && target(Concert)")
    public void performance() {
    }

    @Pointcut("execution(* concert.Performance.perform(..)) && target(GuitarSolo)")
    public void guitarSolo() {
    }

    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }

    @Around("guitarSolo()")
    public void attendGuitarSolo(ProceedingJoinPoint jp) {
        try {
            System.out.println("Silencing cell phones for guitar solo");
            System.out.println("Taking seats for guitar solo");
            jp.proceed();
            System.out.println("CLAP CLAP CLAP!!!");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund for guitar solo");
        }
    }
}