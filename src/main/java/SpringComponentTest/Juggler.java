package SpringComponentTest;

import Rozdzial3.Inject_Value.Performer;

public class Juggler implements Performer {
    private int beanBags = 3;

    public Juggler(){

    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public void perform(){
        System.out.println("ŻONGLUJĘ " + beanBags + " WORECZKAMI Z GROCHEM");
    }

    public int getBeanBags() {
        return beanBags;
    }
}
