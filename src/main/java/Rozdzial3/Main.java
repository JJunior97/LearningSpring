package Rozdzial3;

import Rozdzial3.Inject_Value.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Rozdzial3/rozdzial3.xml");
        ApplicationContext context2 = new ClassPathXmlApplicationContext("Rozdzial3/inject.xml");
        //Performer kenny2 = (Performer) context.getBean("kenny2");
        //kenny2.perform();

/*        Performer duke = (Performer) context.getBean("duke");
        duke.perform();

        Performer harry = (Performer) context.getBean("harry");
        harry.perform();

        Performer mike = (Performer) context.getBean("mike");
        mike.perform();

        Performer olaf = (Performer) context.getBean("olaf");
        olaf.perform();*/

        Performer gorn = (Performer) context2.getBean("gorn");
        gorn.perform();

        Performer duke2 = (Performer) context2.getBean("duke");
        duke2.perform();

    }
}
