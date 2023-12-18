package com.kretsev.proselytes3.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table("files")
public class FileEntity {
    @Id
    private Long id;
    private String name;
    private String location;
    private Status status;
    @Column(value = "created_at")
    private LocalDateTime created;
    @Column(value = "updated_at")
    private LocalDateTime updated;
    @Column(value = "deleted_at")
    private LocalDateTime deleted;
}
