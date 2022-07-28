package com.fido.biznes.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "clients")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cardHolder")
    private String card_holder;

    @Column(name = "cardNumber")
    private String card_number;

    @Column(name = "cardType")
    private String card_type;

    @Column(name = "cardExpirationDate")
    private String card_expiration_date;

    @Column(name = "cardPin")
    private String card_pin;

    @Column(name = "cardBillingAddress")
    private String card_billing_address;

    @Column(name = "cardBillingCity")
    private String card_billing_city;

    @Column(name = "cardBillingZip")
    private String card_billing_zip;

    @Column(name = "cardBillingCountry")
    private String card_billing_country;

    @Column(name = "cardBillingPhone")
    private String card_billing_phone;

    @Column(name = "cardBillingTimeZone")
    private String card_billing_time_zone;

    @Column(name = "cardBalance")
    private String card_balance;

    @Column(name = "cardCurrency")
    private String card_currency;

    @Column(name = "cardStatus")
    private Boolean card_status;

    @Column(name = "cardCreatedDate")
    private String card_created_date;


}
