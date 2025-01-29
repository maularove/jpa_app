package com.fpmislata.finaljpa.domain.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.fpmislata.finaljpa.domain.model.Author;

public interface AuthorService {

    List<Author> findAll();

    Optional<Author> findById(Integer idAuthor);

    Optional<Author> findByName(String name);

    void create(Author author);

    void update(Author author);

    void delete(Integer idAuthor);
}