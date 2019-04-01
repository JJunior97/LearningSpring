package AOP.SimpleAspects;

public class Instrumentalist implements Performer {

    private String song;

    public Instrumentalist() {

    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void perform() {
        System.out.println("GRAM '" + song + "':");
    }
}
