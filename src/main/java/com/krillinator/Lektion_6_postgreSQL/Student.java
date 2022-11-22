package com.krillinator.Lektion_6_postgreSQL;

import javax.persistence.*;

@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;             // Primary Key

    @Column(name = "name")
    private String name;



    public Student() {}
    public Student(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
