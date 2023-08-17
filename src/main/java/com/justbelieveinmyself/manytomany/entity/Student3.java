package com.justbelieveinmyself.manytomany.entity;

import javax.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "students3")
@Builder
@Getter
@Setter
@NoArgsConstructor
public class Student3 {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int mark;
    @ManyToMany(mappedBy = "student3")
    private List<Laptop3> laptop3 = new ArrayList<>();
    public Student3(int id, String name, int mark, List<Laptop3> laptop3){
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.laptop3 = laptop3;
        if(this.laptop3 == null){
            this.laptop3 = new ArrayList<>();
        }
    }
}
