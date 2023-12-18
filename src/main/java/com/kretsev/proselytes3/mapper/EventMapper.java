package com.kretsev.proselytes3.mapper;

import com.kretsev.proselytes3.dto.EventDto;
import com.kretsev.proselytes3.entity.EventEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EventMapper {
    EventDto map(EventEntity eventEntity);

    @InheritInverseConfiguration
    EventEntity map(EventDto dto);
}
