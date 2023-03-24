package com.murilo.roomrent.domain.model;

import org.springframework.cglib.core.TypeUtils;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Sample {
    private UniqueId id;
    private String name;

    public Sample(UniqueId id, String name) {
        verifyRequiredFields(id, name);
        this.id = id;
        this.name = name;
    }

    private void verifyRequiredFields(UniqueId id, String name) {
        if (Objects.isNull(id)) {
            throw new IllegalArgumentException("Sample unique id is required.");
        }
        if (Objects.isNull(name) || name.isEmpty()) {
            throw new IllegalArgumentException("Sample name is required.");
        }
    }

    public String getId() { return id.toString(); }
    public String getName() {
        return name;
    }
}
