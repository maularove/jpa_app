package com.fpmislata.finaljpa.domain.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    @NotNull
    Integer id;
    @NotBlank
    String name;
    @NotBlank
    String nationality;
    @NotBlank
    String biographyEn;
    @NotBlank
    String biographyEs;
    @NotNull
    Integer birthYear;
    @NotNull
    Integer deathYear;
}
