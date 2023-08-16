package com.justbelieveinmyself.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="employees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private EmployeeName eName;
    private double salary;
    private int age;
}
