package com.justbelieveinmyself.onetomany.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "students2")
@Builder
@NoArgsConstructor
@Getter
@Setter
public class Student2 {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int mark;
    @OneToMany(mappedBy = "student2")
    private List<Laptop2> laptop2 = new ArrayList<>();
    public Student2(long id, String name, int mark, List<Laptop2> laptop2) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.laptop2 = laptop2;
        if(this.laptop2 == null) {
            this.laptop2 = new ArrayList<>();
        }
    }
}
