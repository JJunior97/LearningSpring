package Rozdzial3.Klasy;

public class Instrumentalist2 {
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

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
