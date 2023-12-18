package com.kretsev.proselytes3.mapper;

import com.kretsev.proselytes3.dto.FileDto;
import com.kretsev.proselytes3.entity.FileEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FileMapper {
    FileDto map(FileEntity fileEntity);

    @InheritInverseConfiguration
    FileEntity map(FileDto dto);
}
