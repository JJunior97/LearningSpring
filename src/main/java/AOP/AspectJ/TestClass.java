package AOP.AspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("AOP/AspectJ.xml");

        Performer duke = (Performer) ctx.getBean("duke");
        duke.perform();
    }
}
