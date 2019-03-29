package Rozdzial3.Autowired;

import SpringComponentTest.Juggler;
import SpringComponentTest.Poem;

public class PoeticJuggler extends Juggler {
    private Poem poem;

    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem){
        super(beanBags);
        this.poem = poem;
    }

    public void perform(){
        super.perform();
        System.out.println("JEDNOCZEŚNIE RECYTUJĄC...");
        poem.recite();
    }
}
