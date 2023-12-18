package com.kretsev.proselytes3.repository;

import com.kretsev.proselytes3.entity.FileEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Mono;

public interface FileRepository extends R2dbcRepository<FileEntity, Long> {
    Mono<FileEntity> findByName(String name);
}
