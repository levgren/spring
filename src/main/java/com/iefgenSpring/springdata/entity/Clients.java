package com.iefgenSpring.springdata.entity;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Clients {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String phone;
    private String email;
}
