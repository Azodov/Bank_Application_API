package com.fido.biznes.model;

public class Client {
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

    public Client(Long id, String card_holder, String card_number, String card_type, String card_expiration_date, String card_pin, String card_billing_address, String card_billing_city, String card_billing_zip, String card_billing_country, String card_billing_phone, String card_billing_time_zone, String card_balance, String card_currency) {
        this.id = id;
        this.card_holder = card_holder;
        this.card_number = card_number;
        this.card_type = card_type;
        this.card_expiration_date = card_expiration_date;
        this.card_pin = card_pin;
        this.card_billing_address = card_billing_address;
        this.card_billing_city = card_billing_city;
        this.card_billing_zip = card_billing_zip;
        this.card_billing_country = card_billing_country;
        this.card_billing_phone = card_billing_phone;
        this.card_billing_time_zone = card_billing_time_zone;
        this.card_balance = card_balance;
        this.card_currency = card_currency;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCard_holder() {
        return card_holder;
    }

    public void setCard_holder(String card_holder) {
        this.card_holder = card_holder;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public String getCard_type() {
        return card_type;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    public String getCard_expiration_date() {
        return card_expiration_date;
    }

    public void setCard_expiration_date(String card_expiration_date) {
        this.card_expiration_date = card_expiration_date;
    }

    public String getCard_pin() {
        return card_pin;
    }

    public void setCard_pin(String card_pin) {
        this.card_pin = card_pin;
    }

    public String getCard_billing_address() {
        return card_billing_address;
    }

    public void setCard_billing_address(String card_billing_address) {
        this.card_billing_address = card_billing_address;
    }

    public String getCard_billing_city() {
        return card_billing_city;
    }

    public void setCard_billing_city(String card_billing_city) {
        this.card_billing_city = card_billing_city;
    }

    public String getCard_billing_zip() {
        return card_billing_zip;
    }

    public void setCard_billing_zip(String card_billing_zip) {
        this.card_billing_zip = card_billing_zip;
    }

    public String getCard_billing_country() {
        return card_billing_country;
    }

    public void setCard_billing_country(String card_billing_country) {
        this.card_billing_country = card_billing_country;
    }

    public String getCard_billing_phone() {
        return card_billing_phone;
    }

    public void setCard_billing_phone(String card_billing_phone) {
        this.card_billing_phone = card_billing_phone;
    }

    public String getCard_billing_time_zone() {
        return card_billing_time_zone;
    }

    public void setCard_billing_time_zone(String card_billing_time_zone) {
        this.card_billing_time_zone = card_billing_time_zone;
    }

    public String getCard_balance() {
        return card_balance;
    }

    public void setCard_balance(String card_balance) {
        this.card_balance = card_balance;
    }

    public String getCard_currency() {
        return card_currency;
    }

    public void setCard_currency(String card_currency) {
        this.card_currency = card_currency;
    }
}
