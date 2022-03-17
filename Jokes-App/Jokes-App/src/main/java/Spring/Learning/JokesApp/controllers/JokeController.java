package Spring.Learning.JokesApp.controllers;

import Spring.Learning.JokesApp.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokesService jokesService;

    @Autowired
    public JokeController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({ "/", ""})
    public String showJoke(Model model) {

        model.addAttribute("joke", jokesService.getJoke());
        return "index";
    }
}
