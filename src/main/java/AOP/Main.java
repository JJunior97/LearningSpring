package AOP;

import AOP.SimpleAspects.*;
import Rozdzial3.ComponentScan.Performer;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("AOP/simpleAspects.xml");

/*
        Performer mike = (Performer) ctx.getBean("mike");
        mike.perform();
*/

        Thinker john = (Thinker) ctx.getBean("volunteer");

        MindReader ben = (MindReader) ctx.getBean("magician");
    }

    @Test
    public void magicianShouldReadVolunteersMind(){
       ApplicationContext ctx = new ClassPathXmlApplicationContext("AOP/simpleAspects.xml");

       Thinker volunteer = (Thinker) ctx.getBean("volunteer");
       MindReader magician = (MindReader) ctx.getBean("magician");
       volunteer.thinkOfSomething("Dama Kier");

       assertEquals("Dama Kier", magician.getThoughts());
    }
}
