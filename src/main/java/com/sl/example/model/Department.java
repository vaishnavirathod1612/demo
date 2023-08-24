package com.sl.example.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name = "department_tbl")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String  name;
    String staffno;
}
