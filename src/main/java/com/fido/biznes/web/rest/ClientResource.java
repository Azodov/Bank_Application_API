package com.fido.biznes.web.rest;

import com.fido.biznes.domain.Client;
import com.fido.biznes.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientResource {

    private final ClientService clientService;

    public ClientResource(ClientService clientService) {
        this.clientService = clientService;
    }


    @PostMapping("/clients")
    public ResponseEntity create(@RequestBody Client client) {
        Client clients = clientService.save(client);
        return ResponseEntity.ok(clients);
    }

    @GetMapping("/clients")
    public ResponseEntity findAll() {
        List<Client> clients = clientService.findAll();
        return ResponseEntity.ok(clients);
    }
}
