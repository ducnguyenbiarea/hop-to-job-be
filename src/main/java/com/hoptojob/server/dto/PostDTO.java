package com.hoptojob.server.dto;

import lombok.Data;

@Data
public class PostDTO {
    private String profile;
    private String type;
    private String description;
    private String experience;
    private String technology[];
    private String salary;


    public Object getProfile() {
        return profile;
    }

    public Object getTechnology() {
        return technology;
    }

    public Object getDescription() {
        return description;
    }


    public Object getType() {
        return type;
    }


    public Object getExperience() {
        return experience;
    }


}
