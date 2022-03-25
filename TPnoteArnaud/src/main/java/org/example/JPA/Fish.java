package org.example.JPA;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Fish extends Animal {
    @Enumerated(EnumType.STRING)
    private FishLivEnv fishLivEnv;

    public Fish(FishLivEnv fishLivEnv) {
        this.fishLivEnv = fishLivEnv;
    }

    public Fish() {
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fishLivEnv=" + fishLivEnv +
                '}';
    }

    public FishLivEnv getFishLivEnv() {
        return fishLivEnv;
    }

    public void setFishLivEnv(FishLivEnv fishLivEnv) {
        this.fishLivEnv = fishLivEnv;
    }
}
