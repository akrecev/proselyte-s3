package com.kretsev.proselytes3.repository;

import com.kretsev.proselytes3.entity.EventEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface EventRepository extends R2dbcRepository<EventEntity, Long> {
}
