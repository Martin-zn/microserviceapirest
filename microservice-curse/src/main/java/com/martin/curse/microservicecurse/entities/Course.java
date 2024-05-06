package com.martin.curse.microservicecurse.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Table(name = "courses")
@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String teachername;
}
