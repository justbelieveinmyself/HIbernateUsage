package com.justbelieveinmyself.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Embeddable
public class EmployeeName {
    private String fName;
    private String mName;
    private String sName;
}
