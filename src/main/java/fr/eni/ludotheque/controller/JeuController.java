package fr.eni.ludotheque.controller;

import fr.eni.ludotheque.model.Jeu;
import fr.eni.ludotheque.service.JeuService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jeux")
public class JeuController {

    private final JeuService jeuService;

    public JeuController(JeuService jeuService) {
        this.jeuService = jeuService;
    }

    @GetMapping
    public List<Jeu> getAllJeux() {
        return jeuService.getAllJeux();
    }
}
