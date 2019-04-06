package AOP.AspectJAnnotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

    @Pointcut("execution(* AOP.AspectJAnnotation.Performer.perform(..))")
    public void performance(){      //Zadeklarowanie punktu przecięcia - id to nazwa metody, która oznaczona jest ADNOTACJĄ @Pointcut

    }


/*    @Before("performance()")
    public void takeSeats(){
        System.out.println("Widzowie zajmują miejsca...");
    }

    @Before("performance()")
    public void turnOffCellPhones(){
        System.out.println("Widzowie wyłączają telefony komórkowe...");
    }

    @AfterReturning("performance()")
    public void applaud(){
        System.out.println("Brawooo! Oklaski!");
    }

    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Buu! Oddajcie hajs za bilety!");
    }*/

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint){
        try{
            System.out.println("Widzowie zajmują miejsca...");
            System.out.println("Widzowie wyłączają telefony komórkowe...");

            long start = System.currentTimeMillis();

            joinPoint.proceed();                                                //WYWOŁANIE METODY DOCELOWEJ (opakowanej)

            long end = System.currentTimeMillis();
            System.out.println("Brawooo! Oklaski!");
            System.out.println("Występ trwał " + (end - start) + " milisekund.");

        }catch (Throwable t){
            System.out.println("Buu! Oddajcie hajs za bilety!");
        }
    }
}
