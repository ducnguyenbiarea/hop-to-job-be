package com.hoptojob.server.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Document(collection = "posts")
@Data
public class PostModel {
    @NotNull
    @NotEmpty
    private String profile;

    @NotNull
    private String type;

    @NotNull
    private String description;

    @NotNull
    private String experience;

    @NotNull
    private String technology[];

    @NotNull
    private String salary;

    @CreatedDate
    private Date createdAt;

    public void setProfile(Object profile) {
        this.profile = (String) profile;
    }

    public void setDescription(Object description) {
        this.description = (String) description;
    }

    public void setSalary(Object technology) {
        this.technology = (String[]) technology;
    }

    public void setType(Object type) {
        this.type = (String) type;
    }

    public void setExperience(Object experience) {
        this.experience = (String) experience;

    }
}
