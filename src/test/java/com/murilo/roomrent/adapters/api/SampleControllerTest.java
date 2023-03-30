package com.murilo.roomrent.adapters.api;

import com.murilo.roomrent.application.SampleDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(SampleController.class)
public class SampleControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private SampleController sampleController;

    @Test
    public void getSampleById() throws Exception {
        String filter = "foo";
        SampleDTO sampleDTO = new SampleDTO();
        BDDMockito.given(sampleController.get(filter)).willReturn(sampleDTO);

        mvc.perform(get("/sample/" + filter)
                        .contentType(APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("name", is(sampleDTO.name)));
    }
}
