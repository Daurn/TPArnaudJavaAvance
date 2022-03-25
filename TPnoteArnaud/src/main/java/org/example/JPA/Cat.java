package org.example.JPA;

import javax.persistence.Entity;

@Entity
public class Cat extends Animal{
    private String chipId;

    @Override
    public String toString() {
        return "Cat{" +
                "chipId='" + chipId + '\'' +
                '}';
    }

    public String getChipId() {
        return chipId;
    }

    public void setChipId(String chipId) {
        this.chipId = chipId;
    }

    public Cat(String chipId) {
        this.chipId = chipId;
    }

    public Cat() {
    }
}
