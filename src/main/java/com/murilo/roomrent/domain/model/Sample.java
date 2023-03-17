package com.murilo.roomrent.domain.model;

import javax.persistence.*;

@Entity
public class Sample {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Sample(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
