package com.fpmislata.finaljpa.persistence.repository;

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
        return authorJpa.findById(id).map(a -> AuthorDaoMapper.INSTANCE.toAuthor(a));
    }

    @Override
    public Optional<Author> findByName(String name) {
        return authorJpa.findByName(name).map(a -> AuthorDaoMapper.INSTANCE.toAuthor(a));
    }

    @Override
    public void save(Author author) {
        authorJpa.save(AuthorDaoMapper.INSTANCE.toAuthorEntity(author));
    }

    @Override
    public void delete(Integer id) {
        authorJpa.deleteById(id);
    }
}