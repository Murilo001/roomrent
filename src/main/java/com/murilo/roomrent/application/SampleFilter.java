package com.murilo.roomrent.application;

import java.util.UUID;

public class SampleFilter {
    private String id;

    public SampleFilter withId(String id) {
        this.id = id;
        return this;
    }

    public UUID getId() {
        return UUID.fromString(id);
    }
}
