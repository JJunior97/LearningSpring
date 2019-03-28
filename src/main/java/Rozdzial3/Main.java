package Rozdzial3;

import SpringComponentTest.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Rozdzial3/rozdzial3.xml");
        //Performer kenny2 = (Performer) context.getBean("kenny2");
        //kenny2.perform();

        Performer duke = (Performer) context.getBean("duke");
        duke.perform();

        Performer harry = (Performer) context.getBean("harry");
        harry.perform();

        Performer mike = (Performer) context.getBean("mike");
        mike.perform();
    }
}
