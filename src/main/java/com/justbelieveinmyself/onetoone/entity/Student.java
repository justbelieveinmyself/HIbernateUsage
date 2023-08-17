package com.justbelieveinmyself.onetoone.entity;

import javax.persistence.*;
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
    private int id;
    private String name;
    private int mark;
}






