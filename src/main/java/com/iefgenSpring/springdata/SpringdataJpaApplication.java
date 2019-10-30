package com.iefgenSpring.springdata;

import com.iefgenSpring.springdata.entity.Clients;
import com.iefgenSpring.springdata.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringdataJpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringdataJpaApplication.class, args);
	}

	@Autowired
	ClientRepository clientRepository;

	@Override
	public void run(String... args) throws Exception {
		Clients fisher = new Clients(22, "Aleks Fisher", "0956773211", "sasha@gmail.com");
		Clients nekriach = new Clients(23, "Artem Nekriach", "0956744411", "tema@gmail.com");
		Clients vorot = new Clients(24, "Vladimir Vorotniak", "0956744422", "vorot@gmail.com");

		List<Clients> clientsList = Arrays.asList(fisher, nekriach, vorot);
		clientRepository.saveAll(clientsList);
		System.out.println("<<<<<<<<<<" + clientRepository.findAll());

	}
}
