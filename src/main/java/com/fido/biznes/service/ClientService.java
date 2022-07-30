package com.fido.biznes.service;

import com.fido.biznes.domain.Client;
import com.fido.biznes.repository.ClientsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientsRepository clientsRepository;
    public ClientService(ClientsRepository clientsRepository) {
        this.clientsRepository = clientsRepository;
    }

    public Client save(Client client) {
        return clientsRepository.save(client);
    }

    public List<Client> findAll() {
        return clientsRepository.findAll();
    }

    public Client findById(Long id) {
        return clientsRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        clientsRepository.deleteById(id);
    }

    public List<Client> findByLastCardNumber(String cardNumber) {
        return clientsRepository.findByLastCardNumber(cardNumber);
    }

    public List<Client> findByCardExpirationDate(String card_expiration_date) {
        return clientsRepository.findByCardExpirationDate(card_expiration_date);
    }

}
