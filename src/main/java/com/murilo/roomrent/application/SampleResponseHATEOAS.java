package com.murilo.roomrent.application;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.RepresentationModel;

public class SampleResponseHATEOAS extends RepresentationModel<SampleResponseHATEOAS> {

    private String name;

    public SampleResponseHATEOAS(String name) {
        this.name = name;
    }

    @JsonProperty("name")
    String name() {
        return name;
    }
}
