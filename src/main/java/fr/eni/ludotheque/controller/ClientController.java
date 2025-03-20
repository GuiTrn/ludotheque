package fr.eni.ludotheque.controller;

import fr.eni.ludotheque.model.Client;
import fr.eni.ludotheque.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients") // Route principale
public class ClientController {

    @Autowired
    private ClientService clientService;

    // Récupération de TOUS les clients avec leurs adresses via /clients/all
    @GetMapping("/all")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }
}
