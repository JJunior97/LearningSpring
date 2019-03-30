package Rozdzial3;

import Rozdzial3.ComponentScan.Instrument;
import Rozdzial3.ComponentScan.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Rozdzial3/component_scan.xml");

        Performer eddie = (Performer) ctx.getBean("eddie");
        eddie.perform();

        Instrument guitar = (Instrument) ctx.getBean("guitar");
        guitar.play();

        Instrument piano = (Instrument) ctx.getBean("piano");
        piano.play();

/*        Instrument dulcimer = (Instrument) ctx.getBean("hammeredDulcimer");
        dulcimer.play();*/
    }
}
