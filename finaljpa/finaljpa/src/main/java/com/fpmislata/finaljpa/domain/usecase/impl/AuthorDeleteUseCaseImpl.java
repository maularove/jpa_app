package com.fpmislata.finaljpa.domain.usecase.impl;

import com.fpmislata.finaljpa.common.annotion.UseCase;
import com.fpmislata.finaljpa.common.exception.ResourceNotFoundException;
import com.fpmislata.finaljpa.domain.service.interfaces.AuthorService;
import com.fpmislata.finaljpa.domain.usecase.interfaces.AuthorDeleteUseCase;

import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class AuthorDeleteUseCaseImpl implements AuthorDeleteUseCase {

    private final AuthorService authorService;

    @Override
    public void execute(Integer idAuthor) {
        authorService
                .findById(idAuthor)
                .orElseThrow(() -> new ResourceNotFoundException("Author not found"));

        authorService.delete(idAuthor);
    }
}