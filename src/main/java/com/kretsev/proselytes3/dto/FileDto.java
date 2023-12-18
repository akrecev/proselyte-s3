package com.kretsev.proselytes3.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.kretsev.proselytes3.entity.Status;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class FileDto {
    private Long id;
    private String name;
    private String location;
    private Status status;
    private LocalDateTime created;
    private LocalDateTime updated;
    private LocalDateTime deleted;
}
