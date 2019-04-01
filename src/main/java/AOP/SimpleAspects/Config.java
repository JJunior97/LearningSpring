package AOP.SimpleAspects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class Config {

    //@Bean
    public Knight knight(){
        Knight knight = new BraveKnight(new SlayDragonQuest());
        return knight;
    }

    //@Bean
    public Minstrel minstrel(){
        return new Minstrel();
    }

    //@Bean
    public Guitar guitar(){
        return new Guitar();
    }

    //@Bean
    public Piano piano(){
        return new Piano();
    }

    //@Bean
    public Instrumentalist instrumentalist(){
        return new Instrumentalist();
    }

    //@Bean
    public Audience audience(){
        return new Audience();
    }
}
