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

    public SampleDTO execute(SampleFilter filter) {
        Optional<Sample> sampleOptional = sampleRepository.findById(filter.getId());
        return sampleOptional.map(this::createDTO).orElse(null);
    }

    private SampleDTO createDTO(Sample sample) {
        SampleDTO sampleDTO = new SampleDTO();
        sampleDTO.id = sample.getUniqueId();
        sampleDTO.name = sample.getName();
        return sampleDTO;
    }
}
