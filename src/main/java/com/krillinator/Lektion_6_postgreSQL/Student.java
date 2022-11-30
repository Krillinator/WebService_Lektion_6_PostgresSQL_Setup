package com.krillinator.Lektion_6_postgreSQL;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;             // Primary Key

    // @Column(name = "name")
    private String name;



    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

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
