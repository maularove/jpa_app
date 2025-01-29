package com.fpmislata.finaljpa.domain.usecase.impl;

import com.fpmislata.finaljpa.common.annotion.UseCase;
import com.fpmislata.finaljpa.common.exception.ResourceNotFoundException;
import com.fpmislata.finaljpa.domain.model.Author;
import com.fpmislata.finaljpa.domain.service.interfaces.AuthorService;
import com.fpmislata.finaljpa.domain.usecase.interfaces.AuthorFindByIdUseCase;

import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class AuthorFindByIdUseCaseImpl implements AuthorFindByIdUseCase {

    private final AuthorService authorService;

    @Override
    public Author execute(Integer id) {
        return authorService
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Author not found"));
    }
}