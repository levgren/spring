package com.iefgenSpring.springdata;

import com.iefgenSpring.springdata.entity.Clients;
import com.iefgenSpring.springdata.jdbc.ClientJdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class SpringdataApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringdataApplication.class, args);
	}

	@Autowired
	ClientJdbcDao clientJdbcDao;

	@Override
	public void run(String... args) throws Exception {
		Clients kosch = new Clients(21, "aleksandr Koscheev", "0956673211", "sasha@gmail.com");
		clientJdbcDao.insert(kosch);
	}
}
