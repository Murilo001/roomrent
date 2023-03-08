package com.murilo.roomrent.domain.repository;

import com.murilo.roomrent.domain.model.Sample;

import java.util.Optional;

public interface SampleRepository {

    Optional<Sample> get(String foo);
}
