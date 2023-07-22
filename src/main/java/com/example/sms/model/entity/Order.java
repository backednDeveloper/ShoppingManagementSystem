package com.example.sms.model.entity;

import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "Order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "order_status")
    private boolean status;
    @Pattern(regexp = "[A-Za-z0-9]+")
    @Column(name = "order_weight", nullable = false, length = 25)
    private Double weight;
    @Pattern(regexp = "[A-Za-z0-9]+")
    @Column(name = "order_price", nullable = false, length = 25)
    private int price;
    @Column(name = "order_date", nullable = false)
    private LocalDateTime orderDate;
    @Pattern(regexp = "[A-Za-z0-9]+")
    @Column(name = "order_shipping_adress", nullable = false, length = 30)
    private String shippingAdress;
}
