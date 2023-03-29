package com.murilo.roomrent.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Sample {

    @Id
    @GeneratedValue
    private Long id;
    private UniqueId uniqueId;
    private String name;

    public Sample(UniqueId uniqueId, String name) {
        verifyRequiredFields(uniqueId, name);
        this.uniqueId = uniqueId;
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

    public String getUniqueId() { return uniqueId.toString(); }
    public String getName() {
        return name;
    }
}
