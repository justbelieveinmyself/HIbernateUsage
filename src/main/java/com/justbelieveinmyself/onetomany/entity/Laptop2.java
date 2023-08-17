package com.justbelieveinmyself.onetomany.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name ="laptops2")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Laptop2 {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long lid;
    private String name;
    @ManyToOne
    private Student2 student2;
}
