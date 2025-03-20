package fr.eni.ludotheque.service;

import fr.eni.ludotheque.model.Client;
import fr.eni.ludotheque.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    // Récupérer tous les clients avec leurs adresses
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
