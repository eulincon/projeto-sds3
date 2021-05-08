package com.devsuperior.dsvendas.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_sellers")
@Builder
@Data
public class Seller {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "seller")
    private List<Sale> sales;
}
