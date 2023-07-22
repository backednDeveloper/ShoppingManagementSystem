package com.example.sms.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "catagory")
public class Catagory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Pattern(regexp = "[A-Za-z]+")
    @Column(name = "name",nullable = false,length = 25)
    private String name;

    @OneToMany(targetEntity = Product.class)
    @Column(name = "product_id")
    private List<Product> products;
}
