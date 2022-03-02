package com.springboothibernate.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "city")
    private String city;

    private Certificate certi;
    public Student() {
    }

    public Certificate getCerti() {
        return certi;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", certi=" + certi +
                '}';
    }

    public void setCerti(Certificate certi) {
        this.certi = certi;
    }

    public Student(int id, String name, String city, Certificate certi) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.certi = certi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
