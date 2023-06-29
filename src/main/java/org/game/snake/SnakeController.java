package org.game.snake;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SnakeController {
    @RequestMapping(value="/field", method=RequestMethod.GET)
    public String fieldForm(Model model) {
        model.addAttribute("field", new Field());
        return "field";
    }

    @RequestMapping(value="/field", method=RequestMethod.POST)
    public String fieldSubmit(@ModelAttribute Field field, Model model) {
        model.addAttribute("field", field);
        return "result";
    }

}