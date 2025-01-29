package com.fpmislata.finaljpa.persistence.jpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpmislata.finaljpa.persistence.jpa.entity.AuthorEntity;

public interface AuthorJpa extends JpaRepository<AuthorEntity, Integer> {
    Optional<AuthorEntity> findByName(String name);
}