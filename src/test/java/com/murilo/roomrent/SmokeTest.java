package com.murilo.roomrent;

import com.murilo.roomrent.adapters.api.SampleController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SmokeTest {

    @Autowired
    private SampleController sampleController;

    @Test
    public void contextLoads() throws Exception {
        Assertions.assertThat(sampleController).isNotNull();
    }
}
