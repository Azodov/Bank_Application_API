package com.fido.biznes.service;

import com.fido.biznes.domain.Client;
import com.fido.biznes.repository.ClientsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private ClientsRepository clientsRepository;
    public ClientService(ClientsRepository clientsRepository) {
        this.clientsRepository = clientsRepository;
    }

    public Client save(Client client) {
        return clientsRepository.save(client);
    }

    public List<Client> findAll() {
        return clientsRepository.findAll();
    }
}
