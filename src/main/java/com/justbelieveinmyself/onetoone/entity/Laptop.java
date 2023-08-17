package com.justbelieveinmyself.onetoone.entity;

import javax.persistence.*;
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
    private int lid;
    private String name;
    @OneToOne
    private Student student;
}
