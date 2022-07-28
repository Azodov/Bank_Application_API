package com.fido.biznes.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Client2 {
    private Long id;
    private String card_holder;
    private String card_number;
    private String card_type;
    private String card_expiration_date;
    private String card_pin;
    private String card_billing_address;
    private String card_billing_city;
    private String card_billing_zip;
    private String card_billing_country;
    private String card_billing_phone;
    private String card_billing_time_zone;
    private String card_balance;
    private String card_currency;
}
