package com.murilo.roomrent.domain.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.util.UUID;

@Embeddable
public class UniqueId {
    @Id
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID id;

    public UniqueId() {
        this.id = UUID.randomUUID();
    }
}
