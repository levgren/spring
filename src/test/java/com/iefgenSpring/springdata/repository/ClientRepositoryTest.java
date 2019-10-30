package com.iefgenSpring.springdata.repository;

import com.iefgenSpring.springdata.entity.Clients;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class ClientRepositoryTest {

    @Autowired
    ClientRepository clientRepository;

    @Test
    void findByName() {
        List<Clients> clients = clientRepository.findByName("Aleks Fisher");
        assertThat(clients).hasSize(1);
        assertThat(clients.get(0).getName()).isEqualTo("Aleks Fisher");
    }
}