package Rozdzial3;

import Rozdzial3.JavaConfiguration.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class javaConfigurationTest {

    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Rozdzial3/javaConfiguration.xml");

/*        Performer duke = (Performer) ctx.getBean("duke");
        duke.perform();

        Performer mike = (Performer) ctx.getBean("mike");
        mike.perform();

        Performer kenny = (Performer) ctx.getBean("kenny");
        kenny.perform();*/

        Performer poeticDuke = (Performer) ctx.getBean("poeticDuke");
        poeticDuke.perform();
    }
}
