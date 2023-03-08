package com.murilo.roomrent.adapters.persistence;

import com.murilo.roomrent.domain.model.Sample;
import com.murilo.roomrent.domain.repository.SampleRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SampleMemoryRepository implements SampleRepository {

    private List<Sample> samples = new ArrayList<>();

    public void setSamples(List<Sample> samples) {
        this.samples = samples;
    }

    public List<Sample> getSamples() {
        return samples;
    }

    @Override
    public Optional<Sample> get(String foo) {
        return samples.stream().filter(sample -> sample.getName().contains(foo)).findAny();
    }
}
