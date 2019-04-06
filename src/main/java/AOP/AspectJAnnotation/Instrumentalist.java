package AOP.AspectJAnnotation;

public class Instrumentalist implements Performer {

    private String song;
    private Instrument instrument;

    public Instrumentalist() {

    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void perform() {
        System.out.println("GRAM '" + song + "':");
        instrument.play();
    }
}
