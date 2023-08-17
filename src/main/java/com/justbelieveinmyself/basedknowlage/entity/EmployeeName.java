package com.justbelieveinmyself.basedknowlage.entity;

import javax.persistence.*;
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
