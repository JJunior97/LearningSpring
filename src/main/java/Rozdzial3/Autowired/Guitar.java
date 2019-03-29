package Rozdzial3.Autowired;

//@Qualifier("stringed")
@StringedInstrument
@Strumned
public class Guitar implements Instrument {

    public Guitar(){

    }

    public void play(){
        System.out.println("BRZDĘK BRZDĘK BRZDĘK");
    }
}
