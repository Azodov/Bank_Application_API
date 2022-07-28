package com.fido.biznes.web.rest;

import com.fido.biznes.model.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientResource {
    @GetMapping("/clients")
    public ResponseEntity getClients() {
        Client client = new Client(1L, "Doniyor Azodov", "9860190133849895", "HUMO", "01/26", "0852", "KHorezm, Bagat, Nurafshon MFY, Tafakkur ko'cha 56-uy", "Urgench", "220100", "Uzbekistan", "+998997341636", "Asia/Tashkent GMT+5", "10000000", "UZS");
        Client client2 = new Client(2L, "Doniyor Azodov", "8600060421929705", "UZCARD", "04/24", "1234", "KHorezm, Bagat, Nurafshon MFY, Tafakkur ko'cha 56-uy", "Urgench", "220100", "Uzbekistan", "+998995909555", "Asia/Tashkent GMT+5", "2500000", "UZS");
        Client client3 = new Client(3L, "Doniyor Azodov", "4231200014987526", "VISA", "07/25", "0852", "KHorezm, Bagat, Nurafshon MFY, Tafakkur ko'cha 56-uy", "Urgench", "220100", "Uzbekistan", "+998994562034", "Asia/Tashkent GMT+5", "100", "USD");
        List<Client> clients = new ArrayList<>();
        clients.add(client);
        clients.add(client2);
        clients.add(client3);
        return ResponseEntity.ok(clients);
    }

    @GetMapping("/clients/{id}")
    public ResponseEntity getClient(@PathVariable Long id) {
        Client client = new Client(id, "Doniyor Azodov", "9860190133849895", "HUMO", "01/26", "0852", "KHorezm, Bagat, Nurafshon MFY, Tafakkur ko'cha 56-uy", "Urgench", "220100", "Uzbekistan", "+998997341636", "Asia/Tashkent GMT+5", "10000000", "UZS");
        return ResponseEntity.ok(client);
    }

    @PostMapping("/clients")
    public ResponseEntity createNewClient(@RequestBody Client client) {
        return ResponseEntity.ok(client);
    }

    @PutMapping("/clients/{id}")
    public ResponseEntity updateClient(@PathVariable Long id, @RequestBody Client clientNew) {
        Client client = new Client(id, "Doniyor Azodov", "9860190133849895", "HUMO", "01/26", "0852", "KHorezm, Bagat, Nurafshon MFY, Tafakkur ko'cha 56-uy", "Urgench", "220100", "Uzbekistan", "+998997341636", "Asia/Tashkent GMT+5", "10000000", "UZS");
        client.setCard_holder(clientNew.getCard_holder());
        client.setCard_number(clientNew.getCard_number());
        client.setCard_type(clientNew.getCard_type());
        client.setCard_expiration_date(clientNew.getCard_expiration_date());
        client.setCard_pin(clientNew.getCard_pin());
        client.setCard_billing_address(clientNew.getCard_billing_address());
        client.setCard_billing_city(clientNew.getCard_billing_city());
        client.setCard_billing_zip(clientNew.getCard_billing_zip());
        client.setCard_billing_country(clientNew.getCard_billing_country());
        client.setCard_billing_phone(clientNew.getCard_billing_phone());
        client.setCard_billing_time_zone(clientNew.getCard_billing_time_zone());
        client.setCard_balance(clientNew.getCard_balance());
        client.setCard_currency(clientNew.getCard_currency());


        client.setCard_balance(clientNew.getCard_balance());
        return ResponseEntity.ok(client);
    }

    @DeleteMapping("/clients/{id}")
    public ResponseEntity deleteClient(@PathVariable Long id) {
        return ResponseEntity.ok("Client with id " + id + " deleted");
    }
}
