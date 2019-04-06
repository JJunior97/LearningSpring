package AOP.Wprowadzenie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("AOP/wprowadzenie.xml");

        Performer mike = (Performer) ctx.getBean("mike");
        mike.perform();

        ((Contestant) mike).receiveAward();                     //ASPEKTY DZIAŁAJĄ DOPIERO W RUNTIME !!!
    }
}
