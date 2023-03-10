package com.murilo.roomrent.adapters.persistence;

import com.murilo.roomrent.domain.model.Sample;
import com.murilo.roomrent.domain.repository.SampleRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class SampleMemoryRepository implements SampleRepository {

    private List<Sample> samples = Arrays.asList(new Sample("foo"), new Sample("barr"), new Sample("baz"));


    public List<Sample> getSamples() {
        return samples;
    }

    @Override
    public Optional<Sample> get(String foo) {
        return samples.stream().filter(sample -> sample.getName().contains(foo)).findAny();
    }
}
