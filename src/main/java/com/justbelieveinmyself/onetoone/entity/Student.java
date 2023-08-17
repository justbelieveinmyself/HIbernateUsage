package com.justbelieveinmyself.onetoone.entity;

import jakarta.persistence.*;
import lombok.*;
@Table(name = "students")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int mark;
}






