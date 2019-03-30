package Rozdzial3.JavaConfiguration;

public class Juggler implements Performer {

    private int beanBags = 3;

    public Juggler(){

    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public int getBeanBags() {
        return beanBags;
    }

    public void setBeanBags(int beanBags) {
        this.beanBags = beanBags;
    }

    public void perform() {
        System.out.println("ŻONGLUJĘ " + beanBags + " WORECZKAMI Z GROCHEM");
    }
}
