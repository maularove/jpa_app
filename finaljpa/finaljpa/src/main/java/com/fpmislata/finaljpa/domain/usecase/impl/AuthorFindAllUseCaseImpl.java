package com.fpmislata.finaljpa.domain.usecase.impl;

import java.util.List;

import com.fpmislata.finaljpa.common.annotion.UseCase;
import com.fpmislata.finaljpa.domain.model.Author;
import com.fpmislata.finaljpa.domain.service.interfaces.AuthorService;
import com.fpmislata.finaljpa.domain.usecase.interfaces.AuthorFindAllUseCase;

import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class AuthorFindAllUseCaseImpl implements AuthorFindAllUseCase {

    private final AuthorService authorService;

    @Override
    public List<Author> execute() {
        return authorService.findAll();
    }
}