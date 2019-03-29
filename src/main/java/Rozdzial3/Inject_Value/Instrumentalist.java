package Rozdzial3.Inject_Value;


import org.springframework.beans.factory.annotation.Value;

import javax.inject.Inject;

public class Instrumentalist implements Performer {

    @Inject
    //@Named("guitar")
    @StringedInstrument
    @Strumned
    private Instrument instrument;
    private int age;

    //@Value("Back in black")       //Przypisanie wartości 'na sztywno'
    //@Value("#{systemProperties.myFavoriteSong}")          //To tylko przykład i taka właściwość nie isnieje
    @Value("#{songs[0]}")
    private Song song;

    public Instrumentalist(){

    }

    public void perform(){
        System.out.println("GRAM " + song.getTitle() + " : ");
        instrument.play();
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
