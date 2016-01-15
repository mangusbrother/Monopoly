package com.mangusbrother;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:board.xml")
public class MonopolyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonopolyApplication.class, args);
    }

    @Bean
    CommandLineRunner lookup(Game game) {
        return args -> {
            Player p = new Player();
            game.rollDice(p);
            game.rollDice(p);
            game.rollDice(p);
        };
    }
}
