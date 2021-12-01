package com.Exercice.student;

import javax.persistence.*;

@Entity
@Table
public class Student {
    @Id

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;
    private String name;
    private String email;
    private String level;
    private String phone;
    private String image;
    @Column(nullable = false, updatable = false)
    private String studentCode;

    public Student(){

    }

    public Student(String name, String email, String level, String phone, String image, String studentCode) {
        this.name = name;
        this.email = email;
        this.level = level;
        this.phone = phone;
        this.image = image;
        this.studentCode = studentCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + level + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + image + '\'' +
                '}';
    }

}
