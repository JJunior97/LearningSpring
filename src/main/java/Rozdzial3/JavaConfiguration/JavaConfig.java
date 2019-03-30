package Rozdzial3.JavaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Performer duke(){
        return new Juggler();
    }

    @Bean
    public Performer mike(){
        return new Juggler(15);
    }

    @Bean
    public Performer kenny(){
        Instrumentalist kenny = new Instrumentalist();
        kenny.setInstrument(new Guitar());
        kenny.setSong("Sex on fire");
        return kenny;
    }

    @Bean
    public Poem sonnet29(){
        return new Poem29();
    }

    @Bean
    public Performer poeticDuke(){
        return new PoeticJuggler(sonnet29());       //Spring pod spodem przechwytuje wywołanie metody (dynamic proxy) i szuka komponentu o takiej nazwie jak nazwa metody, zamiast zwracać za każdym razem nową instancję komponentu!
    }
}
