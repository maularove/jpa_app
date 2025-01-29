package com.fpmislata.finaljpa.domain.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fpmislata.finaljpa.domain.model.Author;
import com.fpmislata.finaljpa.domain.repository.AuthorRepository;
import com.fpmislata.finaljpa.domain.service.interfaces.AuthorService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public Optional<Author> findById(Integer idAuthor) {
        return authorRepository.findById(idAuthor);
    }

    @Override
    public Optional<Author> findByName(String name) {
        return authorRepository.findByName(name);
    }

    @Override
    public void create(Author author) {
        authorRepository.save(author);
    }

    @Override
    public void update(Author author) {
        authorRepository.save(author);
    }

    @Override
    public void delete(Integer idAuthor) {
        authorRepository.delete(idAuthor);
    }
}