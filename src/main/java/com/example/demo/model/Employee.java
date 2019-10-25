package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name= "employee")
public class Employee {
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotBlank
    @Column(name = "first_name", nullable = false)
    private String firstname;

    @NotBlank
    @Column(name = "last_name", nullable = false)
    private String lastname;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @NotBlank
    @Column(name = "emailId", nullable = false)
    private String emailId;

    public Employee(String firstname, String lastname, String emailId) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.emailId = emailId;
    }

    public Employee() {

    }
}
