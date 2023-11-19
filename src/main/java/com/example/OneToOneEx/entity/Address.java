package com.example.OneToOneEx.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "address_table")
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String village;

    private String city;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "address", fetch = FetchType.LAZY)
    @JsonIgnoreProperties("address")
    private User user;
}
