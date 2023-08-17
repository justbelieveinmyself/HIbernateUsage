package com.justbelieveinmyself.onetomany.entity;

import javax.persistence.*;
import lombok.*;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name ="laptops2")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Laptop2 {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lid;
    private String name;
    @ManyToOne
    private Student2 student2;
}
