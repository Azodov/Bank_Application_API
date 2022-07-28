package com.fido.biznes.web.rest;

import com.fido.biznes.config.CardNumberGenerator;
import com.fido.biznes.config.GetCalendar;
import com.fido.biznes.domain.Client;
import com.fido.biznes.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
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
        Calendar calendar = new GregorianCalendar();
        CardNumberGenerator cardNumberGenerator = new CardNumberGenerator();
        GetCalendar getCalendar = new GetCalendar();
        if (client.getCard_type().equals("UZCARD")){
            client.setCard_currency("UZS");
            calendar.add(Calendar.YEAR, 5);
            client.setCard_number(cardNumberGenerator.generate("8600", 16));
            client.setCard_expiration_date(calendar.getTime().toString());
        } else if (client.getCard_type().equals("VISA")) {
            client.setCard_currency("USD");
            client.setCard_number(cardNumberGenerator.generate("4231", 16));
            calendar.add(Calendar.YEAR, 3);
            client.setCard_expiration_date(calendar.getTime().toString());
        }else if (client.getCard_type().equals("HUMO")) {
            client.setCard_currency("UZS");
            client.setCard_number(cardNumberGenerator.generate("9860", 16));
            calendar.add(Calendar.YEAR, 5);
            client.setCard_expiration_date(calendar.getTime().toString());
        }
        client.setCard_status(true);
        client.setCard_billing_time_zone(calendar.getTimeZone().toZoneId().getId());
        client.setCard_created_date(getCalendar.getCurrentDate());
        client.setCard_balance("0");
        Client clients = clientService.save(client);
        return ResponseEntity.ok(clients);
    }

    @GetMapping("/clients")
    public ResponseEntity getAll() {
        List<Client> clients = clientService.findAll();
        return ResponseEntity.ok(clients);
    }

    @GetMapping("/clients/{id}")
    public ResponseEntity findById(@PathVariable Long id) {
        Client client = clientService.findById(id);
        return ResponseEntity.ok(client);
    }
}
