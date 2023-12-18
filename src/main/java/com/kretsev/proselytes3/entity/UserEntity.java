package com.kretsev.proselytes3.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table("users")
public class UserEntity {
    @Id
    private Long id;
    private String username;
    private String password;
    private UserRole role;
    private Status status;
    @Column(value = "created_at")
    private LocalDateTime created;
    @Column(value = "updated_at")
    private LocalDateTime updated;
    @Column(value = "deleted_at")
    private LocalDateTime deleted;

    @ToString.Include(name = "password")
    private String maskPassword() {
        return "********";
    }
}
