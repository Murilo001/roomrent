package com.murilo.roomrent.application;

import com.murilo.roomrent.domain.model.Sample;
import com.murilo.roomrent.domain.model.SampleBuilder;
import com.murilo.roomrent.domain.repository.SampleRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;
import java.util.UUID;

public class SampleApplicationTest {

    private SampleApplication service;
    private SampleRepository sampleRepository;

    @BeforeEach
    void setUp() {
        sampleRepository = Mockito.mock(SampleRepository.class);
        service = new SampleApplication(sampleRepository);
    }

    @Test
    void shouldGetASampleById() {
        UUID searchId = UUID.randomUUID();
        SampleFilter sampleFilter = new SampleFilter().withId(searchId.toString());
        Sample sample = new SampleBuilder().create();
        SampleDTO expectedSample = createSampleDtoFromSample(sample);
        Mockito.when(sampleRepository.findById(sampleFilter.getId()))
                .thenReturn(Optional.of(sample));

        SampleDTO result = service.execute(sampleFilter);

        Assertions.assertThat(result).usingRecursiveComparison().isEqualTo(expectedSample);
    }

    @Test
    void shouldNotReturnASampleWhenCannotFindASampleById() {
        UUID searchId = UUID.randomUUID();
        SampleFilter sampleFilter = new SampleFilter().withId(searchId.toString());
        Mockito.when(sampleRepository.findById(sampleFilter.getId())).thenReturn(Optional.empty());

        SampleDTO result = service.execute(sampleFilter);

        Assertions.assertThat(result).isNull();
    }

    private SampleDTO createSampleDtoFromSample(Sample sample) {
        SampleDTO sampleDTO = new SampleDTO();
        sampleDTO.id = sample.getUniqueId();
        sampleDTO.name = sample.getName();
        return sampleDTO;
    }
}
