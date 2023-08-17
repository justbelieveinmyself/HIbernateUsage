package com.justbelieveinmyself.onetoone.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "laptops")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class Laptop {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long lid;
    private String name;
    @OneToOne
    private Student student;
}
