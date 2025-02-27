package com.wecompany.choongangihwa.dto;

import lombok.Data;

@Data
public class productDTO {
    public String name;
    public String description;

    public productDTO(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "productDTO{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
