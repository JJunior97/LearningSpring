package Rozdzial3.ComponentScan;

import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component("eddie")
public class Instrumentalist implements Performer{

    @Inject
    private Instrument instrument;

    @Inject
    private Song song;

    public Instrumentalist(){

    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public void perform() {
        System.out.println("Gram '" + song.getTitle() + "': ");
        instrument.play();
    }
}
