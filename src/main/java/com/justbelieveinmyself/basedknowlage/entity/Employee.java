package com.justbelieveinmyself.basedknowlage.entity;

import lombok.*;
import javax.persistence.*;

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
    private int id;
    private EmployeeName eName;
    private double salary;
    private int age;
}
