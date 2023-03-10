package com.murilo.roomrent.adapters.api;

import com.murilo.roomrent.application.SampleApplication;
import com.murilo.roomrent.application.SampleFilter;
import com.murilo.roomrent.application.SampleResponse;
import com.murilo.roomrent.application.SampleResponseHATEOAS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sample")
public class SampleController {

    @Autowired
    private final SampleApplication service;

    public SampleController(SampleApplication service) {
        this.service = service;
    }

    @GetMapping("{foo}")
    SampleResponse get(@PathVariable("foo") String foo) {
        SampleFilter sampleFilter = new SampleFilter().withName(foo);
        return service.execute(sampleFilter);
    }

    @GetMapping("hateoas")
    SampleResponseHATEOAS getHateoas() {
        SampleResponseHATEOAS responseHATEOAS = new SampleResponseHATEOAS("name");
        responseHATEOAS.add(Link.of("https://localhost:8080/sample/hateoas"));
        return responseHATEOAS;
    }
}
