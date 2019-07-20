package com.womencancode.projetofinal.model;

import com.womencancode.projetofinal.service.BaseModel;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Data
@EqualsAndHashCode (callSuper = true)


public class Role extends BaseModel {
    @NonNull
    private String name;

    @Builder

    public Role (String id, LocalDateTime createdDate, LocalDateTime lastModifiedDate, String name){
        super (id, createdDate, lastModifiedDate);
        this.name = name;

    }

}
