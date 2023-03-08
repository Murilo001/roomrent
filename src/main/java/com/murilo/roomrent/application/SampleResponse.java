package com.murilo.roomrent.application;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.murilo.roomrent.domain.model.Sample;

public class SampleResponse {
    private final String name;

    private SampleResponse(final String name) {
        this.name = name;
    }

    static SampleResponse of(final Sample sample) {
        return new SampleResponse(sample.getName());
    }

    @JsonProperty("name")
    String name() {
        return name;
    }
}
