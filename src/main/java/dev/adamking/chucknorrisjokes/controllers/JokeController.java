package dev.adamking.chucknorrisjokes.controllers;

import dev.adamking.chucknorrisjokes.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String showJoke(Model model) {
        model.addAttribute("joke", this.jokeService.getJoke());

        return "joke";
    }
}
