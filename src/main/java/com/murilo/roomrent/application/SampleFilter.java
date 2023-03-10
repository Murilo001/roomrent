package com.murilo.roomrent.application;

public class SampleFilter {
    private String name;

    public SampleFilter withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
}
