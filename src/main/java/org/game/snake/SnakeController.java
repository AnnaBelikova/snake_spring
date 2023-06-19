package org.game.snake;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//public class GreetingController {
//
//    @GetMapping("/greeting")
//    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
//        model.addAttribute("name", name);
//        return "greeting";
//    }
//
//}

@RestController
public class SnakeController {

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/snake")
    public Field field(@RequestParam(required = false, defaultValue = "9") int col,
                       @RequestParam(required = false, defaultValue = "9") int row) {
        System.out.println("==== get greeting ====");
        return new Field(1, col, row);
    }

    @GetMapping("/snake-javaconfig")
    public Field fieldWithJavaconfig(@RequestParam(required = false, defaultValue = "9") int col,
                                        @RequestParam(required = false, defaultValue = "9") int row) {
        System.out.println("==== in greeting ====");
        return new Field(1, col, row);
    }

}