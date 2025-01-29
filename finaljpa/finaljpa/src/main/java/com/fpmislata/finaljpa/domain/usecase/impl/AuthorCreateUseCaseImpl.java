package com.fpmislata.finaljpa.domain.usecase.impl;

import com.fpmislata.finaljpa.common.annotion.UseCase;
import com.fpmislata.finaljpa.common.exception.ResourceAlreadyExistsException;
import com.fpmislata.finaljpa.domain.model.Author;
import com.fpmislata.finaljpa.domain.service.interfaces.AuthorService;
import com.fpmislata.finaljpa.domain.usecase.interfaces.AuthorCreateUseCase;

import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class AuthorCreateUseCaseImpl implements AuthorCreateUseCase {

    private final AuthorService authorService;

    @Override
    public void execute(Author author) {
        authorService
                .findByName(author.getName())
                .ifPresent(a -> {
                    throw new ResourceAlreadyExistsException("Author already exists");
                });

        authorService.create(author);
    }
}