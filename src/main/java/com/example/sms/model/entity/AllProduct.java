package com.example.sms.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "all_product")
@Entity
public class AllProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    //katagoy classi
    //hemcinin productlardan random olaraq produckt qoyulmalidir
}
