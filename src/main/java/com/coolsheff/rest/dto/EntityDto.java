package com.coolsheff.rest.dto;

import com.coolsheff.dao.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EntityDto {

    private int id;

    private String name;

    public static EntityDto toDto(Entity entity){
        return new EntityDto(
                entity.getId(),
                entity.getName()
        );
    }

    public static Entity toDomainObject(EntityDto entityDto){
        return new Entity(
                entityDto.getId(),
                entityDto.getName()
        );
    }
}
