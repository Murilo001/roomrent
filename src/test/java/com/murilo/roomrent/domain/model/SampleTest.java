package com.murilo.roomrent.domain.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SampleTest {

    @Test
    void shouldReturnTheName() {
        String expectedName = "Adolfo";
        Sample sample = new Sample(expectedName);

        String resultName = sample.getName();

        Assertions.assertThat(resultName).isEqualTo(resultName);
    }
}
