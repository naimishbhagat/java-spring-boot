package org.naimish.config;

import org.naimish.Alien;
import org.naimish.Computer;
import org.naimish.Desktop;
import org.naimish.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.naimish")
public class AppConfig {
    //@Bean(name= {"com2","desktop1","comp"})

//    @Bean
//    @Scope("prototype")
//    public Alien alien(Computer com){ //@Qualifier("desktop")
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setComputer(com);
//        return obj;
//    }
//
//    @Bean
//    //@Scope("prototype")
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    //@Scope("prototype")
//    public Laptop laptop(){
//        return new Laptop();
//    }
}
