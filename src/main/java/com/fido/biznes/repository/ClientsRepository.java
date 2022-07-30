package com.fido.biznes.repository;

import com.fido.biznes.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientsRepository extends JpaRepository<Client, Long> {
    @Query("SELECT c FROM Client c WHERE c.card_number like concat('%', :cardNumber)")
    List<Client> findByLastCardNumber(@Param("cardNumber") String cardNumber);

    @Query("SELECT c FROM Client c WHERE c.card_expiration_date = :card_expiration_date")
    List<Client> findByCardExpirationDate(@Param("card_expiration_date") String card_expiration_date);
}
