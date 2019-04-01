package AOP.SimpleAspects;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {

    public Audience(){

    }

    public void takeSeats(){
        System.out.println("Widzowie zajmują miejsca...");
    }

    public void turnOffCellPhones(){
        System.out.println("Widzowie wyłączają telefony komórkowe...");
    }

    public void applaud(){
        System.out.println("Brawooo! Oklaski!");
    }

    public void demandRefund(){
        System.out.println("Buu! Oddajcie hajs za bilety!");
    }

    public void watchPerformance(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("Widzowie zajmują miejsca...");
            System.out.println("Widzowie wyłączają telefony komórkowe...");

            long start = System.currentTimeMillis();

            joinPoint.proceed();

            long end = System.currentTimeMillis();

            System.out.println("Brawooo! Oklaski!");
            System.out.println("Występ trwał " + (end - start) + " milisekund.");

        }catch (Throwable t){
            System.out.println("Buu! Oddajcie hajs za bilety!");
        }
    }
}
