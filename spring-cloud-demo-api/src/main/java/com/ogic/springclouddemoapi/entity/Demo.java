package com.ogic.springclouddemoapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@AllArgsConstructor
@Data
@Accessors(chain = true)
public class Demo implements Serializable {
    private Long id;
    private String name;
    private String sourceDB;

    public Demo(String name) {
        this.name = name;
    }
}
