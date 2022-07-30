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
        boolean check_status = false;
        switch (client.getCard_type()) {
            case "UZCARD":
                try {
                    client.setCard_currency("UZS");
                    calendar.add(Calendar.YEAR, 5);
                    client.setCard_number(cardNumberGenerator.generate("8600", 16));
                    client.setCard_expiration_date(calendar.getTime().toString());
                    check_status = true;
                } catch (Exception e) {
                    ResponseEntity.badRequest().body("Error");
                }
                break;
            case "VISA":
                try {
                    client.setCard_currency("USD");
                    client.setCard_number(cardNumberGenerator.generate("4231", 16));
                    calendar.add(Calendar.YEAR, 3);
                    client.setCard_expiration_date(calendar.getTime().toString());
                    check_status = true;
                } catch (Exception e) {
                    ResponseEntity.badRequest().body("Error");
                }
                break;
            case "HUMO":
                try {
                    client.setCard_currency("UZS");
                    client.setCard_number(cardNumberGenerator.generate("9860", 16));
                    calendar.add(Calendar.YEAR, 5);
                    client.setCard_expiration_date(calendar.getTime().toString());
                    check_status = true;
                } catch (Exception e){
                    ResponseEntity.badRequest().body("Error");
                }
                break;
        }

        client.setCard_status(true);
        client.setCard_billing_time_zone(calendar.getTimeZone().toZoneId().getId());
        client.setCard_created_date(getCalendar.getCurrentDate());
        client.setCard_balance("0");
        clientService.save(client);
        return ResponseEntity.ok(client);
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

    @DeleteMapping("/clients/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        try {
            Client client = clientService.findById(id);
            clientService.delete(id);
            return ResponseEntity.ok(client.getCard_holder() + " ma'lumotlari butunlay o'chirildi.");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @GetMapping("/clients/search")
    public ResponseEntity search(@RequestParam String card_number) {
        List<Client> clients = clientService.findByLastCardNumber(card_number);
        return ResponseEntity.ok(clients);
    }

    @PutMapping("/clients/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody Client client) {
        try {
            Client client1 = clientService.findById(id);
            if (client.getCard_status() != null){
                client1.setCard_status(client.getCard_status());
            }
            if (client.getCard_pin() != null){
                client1.setCard_pin(client.getCard_pin());
            }
            if (client.getCard_balance() != null){
                client1.setCard_balance(client.getCard_balance());
            }
            if (client.getCard_billing_phone() != null){
                client1.setCard_billing_phone(client.getCard_billing_phone());
            }
            if (client.getCard_balance() != null){
                client1.setCard_balance(client.getCard_balance());
            }
            clientService.save(client1);
            return ResponseEntity.ok(client1);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }


}
