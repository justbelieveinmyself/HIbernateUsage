package com.justbelieveinmyself.hql.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "aliens")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Alien {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String color;
    private int age;
    @Override
    public String toString(){
        return "AlienObject {" + getId() + ",name=" + getName() + ",age=" + getAge() + ",color=" + getColor() + "}";
    }
}
