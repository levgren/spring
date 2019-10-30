package com.iefgenSpring.springdata.jdbc;

import com.iefgenSpring.springdata.entity.Clients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Clients> findAll(){
        return jdbcTemplate.query("select * from clients",
                new BeanPropertyRowMapper<>(Clients.class));
    }

    public int insert(Clients clients){
        return jdbcTemplate.update("insert into clients" +
                        "(id, client_name, client_phone, client_email)" +
                        "values (?,?,?,?)",
                clients.getName(), clients.getPhone(), clients.getEmail());
    }
}
