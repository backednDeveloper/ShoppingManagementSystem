package com.example.sms.model.entity;


import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.Pattern;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "Payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Pattern(regexp = "[A-Za-z0-9]+")
    @Column(name = "payment_amount")
    private String amount;
    @Column(name = "payment_status")
    private boolean status;
}
