package com.murilo.roomrent.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.util.UUID;

@Embeddable
public class UniqueId {
    @Column(name = "unique_id", updatable = false, unique = true, nullable = false)
    private UUID id;

    public UniqueId() {
        this.id = UUID.randomUUID();
    }
}
