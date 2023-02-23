package com.class606.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ClassRoom {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private Integer classId;
    private String atitle;
    private String description;

    public ClassRoom(String title, String description) {
        this.atitle = title;
        this.description = description;
    }

    public void setAtitle(String atitle) {
        this.atitle = atitle;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAtitle() {
        return atitle;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassRoom classRoom = (ClassRoom) o;
        return Objects.equals(classId, classRoom.classId) && Objects.equals(atitle, classRoom.atitle) && Objects.equals(description, classRoom.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classId, atitle, description);
    }
}
