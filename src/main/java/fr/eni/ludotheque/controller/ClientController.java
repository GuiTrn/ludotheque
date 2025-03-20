package fr.eni.ludotheque.controller;

import fr.eni.ludotheque.model.Client;
import fr.eni.ludotheque.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    // Récupération de TOUS les clients
    @GetMapping
    public List<Client> getClients() {
        return clientService.getAllClients();
    }
}