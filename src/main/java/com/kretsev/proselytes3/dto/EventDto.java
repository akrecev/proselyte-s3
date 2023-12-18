package com.kretsev.proselytes3.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.kretsev.proselytes3.entity.FileEntity;
import com.kretsev.proselytes3.entity.Status;
import com.kretsev.proselytes3.entity.UserEntity;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;

import java.time.LocalDateTime;


@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class EventDto {
    private Long id;
    private String type;
    private UserEntity user;
    private FileEntity file;
    private Status status;
    private LocalDateTime created;
    private LocalDateTime deleted;
}
