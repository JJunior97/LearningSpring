package Rozdzial3.ComponentScan;

import org.springframework.stereotype.Component;

//@Component                  //Spring automatycznie nadaje bean id takie jak nazwa klasy w camelCase (w tym przypadku "guitar")
public class Guitar implements Instrument {

    public Guitar(){

    }

    public void play() {
        System.out.println("BRZDĘK BRZDĘK BRZDĘK");
    }
}
