package com.example.sms.model.entity;

import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Pattern(regexp = "\\d+")
    @Min(value = 18, message = "Your age must be over 18")
    @Column(name = "customer_age", nullable = false, length = 2)
    private int age;
    @Column(name = "customer_status")
    private int status;
    @Pattern(regexp = "[A-Za-z]+")
    @Column(name = "customer_name", nullable = false, length = 25)
    private String name;
    @Pattern(regexp = "[A-Za-z]+")
    @Column(name = "customer_surname", nullable = false, length = 25)
    private String surname;
    @Pattern(regexp = "\\+\\d+")
    @Column(name = "customer_phone", nullable = false)
    private String phone;
    @Pattern(regexp = "[A-Za-z0-9]+")
    @Column(name = "customer_adress", nullable = false, length = 100)
    private String adress;
    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")
    @Column(name = "customer_email", nullable = false, length = 20)
    private String email;
    @Column(name = "customer_registration_date")
    private LocalDateTime registrationDate;
    @Column(name = "customer_api")
    private Long lastLoginApi;

}
