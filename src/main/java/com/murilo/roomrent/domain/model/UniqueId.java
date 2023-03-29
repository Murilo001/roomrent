package com.murilo.roomrent.domain.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.UUID;

@Embeddable
public class UniqueId {
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID id;

    public UniqueId() {
        this.id = UUID.randomUUID();
    }
}
