package com.example.sms.model.entity;

import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.Pattern;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
@ToString
@EqualsAndHashCode
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Pattern(regexp = "[A-Za-z0-9]+")
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "color", nullable = false, length = 20)
    private String color;

    @Pattern(regexp = "[A-Za-z0-9]+")
    @Column(name = "weight")
    private Long weight;

    @Pattern(regexp = "^\\d+(,\\d{1,2})?$")
    @Column(name = "price", nullable = false)
    private Long price;

    @Pattern(regexp = "\\d+")
    @Column(name = "quantity", nullable = false)
    private Long quantity;

}
