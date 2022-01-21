package com.bartek.Premier.modules;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Manager")
public class Manager {
    @Id
    private Long id;
    private String managerFirstName;
    private String managerLastName;
    private int managerAge;

    public Manager(Long id, String managerFirstName, String managerLastName, int managerAge) {
        this.id = id;
        this.managerFirstName = managerFirstName;
        this.managerLastName = managerLastName;
        this.managerAge = managerAge;
    }

    public Manager() {

    }

    public Long getId() {
        return id;
    }

    public Manager setId(Long id) {
        this.id = id;
        return this;
    }

    public String getManagerFirstName() {
        return managerFirstName;
    }

    public Manager setManagerFirstName(String managerFirstName) {
        this.managerFirstName = managerFirstName;
        return this;
    }

    public String getManagerLastName() {
        return managerLastName;
    }

    public Manager setManagerLastName(String managerLastName) {
        this.managerLastName = managerLastName;
        return this;
    }

    public int getManagerAge() {
        return managerAge;
    }

    public Manager setManagerAge(int managerAge) {
        this.managerAge = managerAge;
        return this;
    }
}
