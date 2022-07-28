package com.fido.biznes.web.rest;

import com.fido.biznes.model.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientResource {
    @GetMapping("/clients")
    public ResponseEntity getStudents() {
        Client client = new Client(1L, "Doniyor Azodov", "9860190133849895", "HUMO", "01/26", "0852", "KHorezm, Bagat, Nurafshon MFY, Tafakkur ko'cha 56-uy", "Urgench", "220100", "Uzbekistan", "+998997341636", "Asia/Tashkent GMT+5", "10000000", "UZS");
        Client client2 = new Client(2L, "Doniyor Azodov", "8600060421929705", "UZCARD", "04/24", "1234", "KHorezm, Bagat, Nurafshon MFY, Tafakkur ko'cha 56-uy", "Urgench", "220100", "Uzbekistan", "+998995909555", "Asia/Tashkent GMT+5", "2500000", "UZS");
        Client client3 = new Client(3L, "Doniyor Azodov", "4231200014987526", "VISA", "07/25", "0852", "KHorezm, Bagat, Nurafshon MFY, Tafakkur ko'cha 56-uy", "Urgench", "220100", "Uzbekistan", "+998994562034", "Asia/Tashkent GMT+5", "100", "USD");
        List<Client> clients = List.of(client, client2, client3);
        return ResponseEntity.ok(clients);
    }
}
