package fr.eni.ludotheque.service;

import fr.eni.ludotheque.model.Jeu;
import fr.eni.ludotheque.repository.JeuRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JeuService {

    private final JeuRepository jeuRepository;

    public JeuService(JeuRepository jeuRepository) {
        this.jeuRepository = jeuRepository;
    }

    public List<Jeu> getAllJeux() {
        return jeuRepository.findAll();
    }
}

