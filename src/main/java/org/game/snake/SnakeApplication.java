package org.game.snake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class SnakeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnakeApplication.class, args);
    }

}