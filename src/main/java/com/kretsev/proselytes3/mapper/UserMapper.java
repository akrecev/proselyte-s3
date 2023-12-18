package com.kretsev.proselytes3.mapper;

import com.kretsev.proselytes3.dto.UserDto;
import com.kretsev.proselytes3.entity.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto map(UserEntity userEntity);

    @InheritInverseConfiguration
    UserEntity map(UserDto dto);
}
