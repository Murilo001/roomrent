package com.murilo.roomrent.application;

import com.murilo.roomrent.domain.repository.SampleRepository;
import org.springframework.stereotype.Service;

@Service
public class SampleApplication {

    private SampleRepository sampleRepository;


    public SampleApplication(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    public SampleResponse execute(String foo) {
        return SampleResponse.of(sampleRepository.get(foo));
    }
}
