package com.bart.affirmations;

import io.micronaut.serde.annotation.Serdeable;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Serdeable 
public class AffirmationCommand {
    @NotNull
    private final Long id;

    @NotBlank
    private final String text;

    public AffirmationCommand(Long id, String text) {
        this.id = id;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

}