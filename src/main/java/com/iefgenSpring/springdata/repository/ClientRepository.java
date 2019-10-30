package com.iefgenSpring.springdata.repository;

import com.iefgenSpring.springdata.entity.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Clients, Integer> {

    List<Clients> findByName(String name);
}
