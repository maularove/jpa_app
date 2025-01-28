package com.fpmislata.finaljpa.persistence.repository.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.fpmislata.finaljpa.domain.model.Author;
import com.fpmislata.finaljpa.domain.repository.AuthorRepository;
import com.fpmislata.finaljpa.persistence.jpa.AuthorJpa;
import com.fpmislata.finaljpa.persistence.jpa.mapper.AuthorDaoMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class AuthorRepositoryImpl implements AuthorRepository {

    private final AuthorJpa authorJpa;

    @Override
    public List<Author> findAll() {
        return AuthorDaoMapper.INSTANCE.toAuthors(authorJpa.findAll());
    }

    @Override
    public Optional<Author> findById(Integer id) {
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public void save(Author author) {
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void delete(Integer id) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
