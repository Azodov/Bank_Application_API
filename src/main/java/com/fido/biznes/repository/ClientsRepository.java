package com.fido.biznes.repository;

import com.fido.biznes.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientsRepository extends JpaRepository<Client, Long> {
//    List<Client> findByCard_holder(String card_holder);
}
