package Rozdzial3.Autowired;

import Rozdzial3.Inject.Performer;
import org.springframework.beans.factory.annotation.Autowired;

public class Instrumentalist2 implements Performer {

    @Autowired
    @StringedInstrument
    @Strumned
    private Instrument instrument;
    private int age;
    private String song;

    public Instrumentalist2(){

    }

    public void perform(){
        System.out.println("GRAM " + song + ":");
        instrument.play();
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String screamSong(){
        return song;
    }


    public void setAge(int age) {
        this.age = age;
    }
}
