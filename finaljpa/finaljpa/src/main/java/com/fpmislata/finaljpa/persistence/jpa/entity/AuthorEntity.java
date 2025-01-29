package com.fpmislata.finaljpa.persistence.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "authors")
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    String nationality;
    @Column(name = "biography_en")
    String biographyEn;
    @Column(name = "biography_es")
    String biographyEs;
    @Column(name = "birth_year")
    Integer birthYear;
    @Column(name = "death_year")
    Integer deathYear;
}