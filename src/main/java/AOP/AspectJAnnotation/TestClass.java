package AOP.AspectJAnnotation;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("AOP/@AspectJ.xml");

        Performer duke = (Performer) context.getBean("duke");
        duke.perform();
        ((Contestant) duke).receiveAward();             //ASPEKTY DZIAŁĄJĄ DOPIERO W RUNTIME !!!
    }

    @Test
    public void magicianShouldReadVolunteersMind(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("AOP/@AspectJ.xml");

        Thinker volunteer = (Thinker) ctx.getBean("volunteer");
        MindReader magician = (MindReader) ctx.getBean("magician");
        volunteer.thinkOfSomething("Dama Kier");

        assertEquals("Dama Kier", magician.getThoughts());
        System.out.println(magician.getThoughts());
    }
}
