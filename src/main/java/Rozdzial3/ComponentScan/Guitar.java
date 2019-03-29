package Rozdzial3.ComponentScan;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument {

    public Guitar(){

    }

    public void play() {
        System.out.println("BRZDĘK BRZDĘK BRZDĘK");
    }
}
