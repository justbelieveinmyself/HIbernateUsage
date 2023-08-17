package com.justbelieveinmyself.basedknowlage.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name = "pass")
    private String password;
    @Override
    public String toString(){
        return "[User{id="+getId() + ",name="+getName() + ",password=" +getPassword() + "}]";
    }
}
