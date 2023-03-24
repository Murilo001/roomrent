package com.murilo.roomrent.domain.repository;

import com.murilo.roomrent.domain.model.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SampleRepository extends JpaRepository<Sample, UUID> {
}
