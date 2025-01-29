package com.fpmislata.finaljpa.domain.usecase.impl;

import com.fpmislata.finaljpa.common.annotion.UseCase;
import com.fpmislata.finaljpa.common.exception.ResourceNotFoundException;
import com.fpmislata.finaljpa.domain.model.Author;
import com.fpmislata.finaljpa.domain.service.interfaces.AuthorService;
import com.fpmislata.finaljpa.domain.usecase.interfaces.AuthorUpdateUseCase;

import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class AuthorUpdateUseCaseImpl implements AuthorUpdateUseCase {

    private final AuthorService authorService;

    @Override
    public void execute(Author author) {
        authorService
                .findById(author.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Author not found"));

        authorService.update(author);
    }
}