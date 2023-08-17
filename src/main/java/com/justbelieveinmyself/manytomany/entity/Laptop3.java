package com.justbelieveinmyself.manytomany.entity;

import javax.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "laptops3")
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Laptop3 {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lid;
    private String name;
    @ManyToMany
    private List<Student3> student3 = new ArrayList<>();
    public Laptop3(int lid, String name, List<Student3> student3){
        this.lid = lid;
        this.name = name;
        this.student3 = student3;
        if(this.student3 == null){
            this.student3 = new ArrayList<>();
        }
    }
}
