package com.murilo.roomrent.domain.model;

public class SampleBuilder {

    private UniqueId uniqueId;
    private String name;

    public SampleBuilder() {
        this.uniqueId = new UniqueId();
        this.name = "default";
    }

    public Sample create() {
        return new Sample(uniqueId, name);
    }
}
