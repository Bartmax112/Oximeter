package com.bart.affirmations;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.serde.annotation.Serdeable;
// import lombok.Data;
import jakarta.validation.constraints.NotNull;

@Serdeable
@MappedEntity
public class AffirmationEntity {

    @Id
    @GeneratedValue(GeneratedValue.Type.AUTO)
    private Long id;

    @NotNull
    private String text;

    Long getId(){
        return id;
    }

    void setId(Long id){
        this.id=id;
    }

    String getText(){
        return text;
    }

    void setText(String text){
        this.text=text;
    }
    
}
