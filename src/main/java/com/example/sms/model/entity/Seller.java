package com.example.sms.model.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.service.annotation.GetExchange;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "Seller")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Pattern(regexp = "\\d+")
    @Min(value = 18, message = "Your age must be over 18")
    @Column(name = "seller_age", nullable = false)
    private int age;
    @Column(name = "seller_status")
    private boolean status;
    @Pattern(regexp = "[A-Za-z]+")
    @Column(name = "seller_name", nullable = false, length = 25)
    private String name;
    @Pattern(regexp = "[A-Za-z]+")
    @Column(name = "seller_surname", nullable = false, length = 25)
    private String surname;
    @Pattern(regexp = "\\+\\d+")
    @Column(name = "seller_phone", nullable = false)
    private String phone;
    @Pattern(regexp = "[A-Za-z0-9]+")
    @Column(name = "seller_adress", nullable = false, length = 100)
    private String adress;
    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")
    @Column(name = "seller_email", nullable = false, length = 20)
    private String email;
    @Column(name = "seller_registration_date")
    private LocalDateTime registrationDate;
    @Column(name = "seller_api")
    private Long lastLoginApi;

}
