package com.fpmislata.finaljpa.domain.repository;

import java.util.List;
import java.util.Optional;

import com.fpmislata.finaljpa.domain.model.Author;

public interface AuthorRepository {

    List<Author> findAll();

    List<Author> findAllByBookId(Integer bookId);

    Optional<Author> findById(Integer id);

    Optional<Author> findByName(String name);

    void save(Author author);

    void delete(Integer id);
}