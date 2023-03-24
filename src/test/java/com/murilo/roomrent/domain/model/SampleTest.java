package com.murilo.roomrent.domain.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

public class SampleTest {

    @Test
    void shouldReturnTheName() {
        UniqueId uniqueId = new UniqueId();
        String expectedName = "Adolfo";
        Sample sample = new Sample(uniqueId, expectedName);

        String resultName = sample.getName();

        Assertions.assertThat(resultName).isEqualTo(resultName);
    }

    @Test
    void shouldReturnTheId() {
        UniqueId uniqueId = new UniqueId();
        Sample sample = new Sample(uniqueId,"name");

        String resultId = sample.getId();

        Assertions.assertThat(resultId).isNotNull();
    }

    @ParameterizedTest()
    @NullSource
    void shouldNotCreateSampleWithoutRequiredId(UniqueId id) {
        String name = "sbc";
        Throwable thrown = Assertions.catchThrowable(() -> { new Sample(id, name); });

        Assertions.assertThat(thrown).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Sample unique id is required.");
    }

    @ParameterizedTest()
    @NullAndEmptySource
    void shouldNotCreateSampleWithoutRequiredName(String name) {
        UniqueId id = new UniqueId();
        Throwable thrown = Assertions.catchThrowable(() -> { new Sample(id, name); });

        Assertions.assertThat(thrown).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Sample name is required.");
    }
}
