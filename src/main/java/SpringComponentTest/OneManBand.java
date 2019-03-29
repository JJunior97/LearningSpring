package SpringComponentTest;

import Rozdzial3.Inject_Value.Performer;

import java.util.List;

public class OneManBand implements Performer {
    public OneManBand(){

    }

    public void perform(){
        for(Instrument instrument: instruments){
            instrument.play();
        }
    }

    private List<Instrument> instruments;

    public void setInstruments(List<Instrument> instruments) {
        this.instruments = instruments;
    }
}
