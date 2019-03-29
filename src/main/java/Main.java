import Rozdzial3.Inject_Value.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){
/*        MySingleton singleton1 = MySingleton.getInstance();
        MySingleton singleton2 =MySingleton.getInstance();
        singleton1.setValue(25);
        singleton2.setValue(50);
        System.out.println(singleton1.getValue());
        System.out.println(singleton2.getValue());*/

        ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringComponent/spring-idol.xml");
        Performer performer1 = (Performer) ctx.getBean("duke");
        Performer performer2 = (Performer) ctx.getBean("poeticDuke");
        Performer performer3 = (Performer) ctx.getBean("kenny");
        Performer performer4 = (Performer) ctx.getBean("kenny2");
        Performer performer5 = (Performer) ctx.getBean("kenny3");
        Performer performer6 = (Performer) ctx.getBean("poeticDuke2");
        Performer performer7 = (Performer) ctx.getBean("kenny4");
        Performer performer8 = (Performer) ctx.getBean("hank");
        //Performer performer3 = (Performer) ctx.getBean("duke");
        //System.out.println(performer2.equals(performer3));      //Dwie instancje danego komponentu to nie jest ten sam obiekt!!!
        performer1.perform();
        System.out.print("\n\n");
        performer2.perform();
        System.out.print("\n\n");
        performer3.perform();
        System.out.print("\n\n");
        performer4.perform();
        System.out.print("\n\n");
        performer5.perform();
        System.out.print("\n\n");
        performer6.perform();
        System.out.print("\n\n");
        performer7.perform();
        System.out.print("\n\n");
        performer8.perform();
/*        Juggler juggler1 = (Juggler) performer1;
        String result = juggler1.getBeanBags() > 15?"Juggler have more than 15 bean bags!":"Juggler don't have more than 15 bean bags!";
        System.out.println(result);*/
    }
}
