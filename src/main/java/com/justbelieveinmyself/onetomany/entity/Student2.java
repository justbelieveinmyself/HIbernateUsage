package com.justbelieveinmyself.onetomany.entity;

import javax.persistence.*;
import lombok.*;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "students2")
@Builder
@NoArgsConstructor
@Getter
@Setter
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student2 {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int mark;
    @OneToMany(mappedBy = "student2") // EAGER take all information from all related tables / LAZY - will take in runtime if it's needed
    private List<Laptop2> laptop2 = new ArrayList<>();
    public Student2(int id, String name, int mark, List<Laptop2> laptop2) {
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.laptop2 = laptop2;
        if(this.laptop2 == null) {
            this.laptop2 = new ArrayList<>();
        }
    }
}
