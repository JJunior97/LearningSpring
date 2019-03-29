package Rozdzial3.Inject_Value;

import javax.inject.Inject;
import javax.inject.Provider;
import java.util.HashSet;
import java.util.Set;


public class KnifeJuggler implements Performer {

    private Set<Knife> knives;

    public KnifeJuggler() {
    }

    @Inject
    public KnifeJuggler(Provider<Knife> knifeProvider){
        knives = new HashSet<Knife>();
        for(int i=0; i<5; i++){
            knives.add(knifeProvider.get());
        }
    }

    public void perform() {
        System.out.println("ŻONGLUJĘ " + knives.size() + " NOŻAMI");
    }
}
