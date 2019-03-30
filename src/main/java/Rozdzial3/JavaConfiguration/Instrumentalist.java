package Rozdzial3.JavaConfiguration;


public class Instrumentalist implements Performer {

    public Instrument instrument;
    public int age;
    public String song;


    public Instrumentalist(){

    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void perform() {
        System.out.println("Gram '" + song + "':");
        instrument.play();
    }
}
