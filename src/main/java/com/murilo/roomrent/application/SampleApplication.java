package com.murilo.roomrent.application;

import com.murilo.roomrent.domain.model.Sample;
import com.murilo.roomrent.domain.repository.SampleRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SampleApplication {

    private final SampleRepository sampleRepository;

    public SampleApplication(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    public SampleResponse execute(SampleFilter filter) {
        Optional<Sample> sampleOptional = sampleRepository.get(filter.getName());
        return sampleOptional.map(SampleResponse::of).orElse(null);
    }
}
