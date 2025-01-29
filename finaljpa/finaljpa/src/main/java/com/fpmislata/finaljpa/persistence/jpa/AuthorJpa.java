package com.fpmislata.finaljpa.persistence.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fpmislata.finaljpa.persistence.jpa.entity.AuthorEntity;

public interface AuthorJpa extends JpaRepository<AuthorEntity, Integer> {
    Optional<AuthorEntity> findByName(String name);

    @Query(value = "SELECT a.* FROM authors a " +
            "INNER JOIN books_authors ba ON a.id = ba.author_id " +
            "WHERE ba.book_id = :bookId", nativeQuery = true)
    List<AuthorEntity> findAllByBookId(@Param("bookId") Integer bookId);
}