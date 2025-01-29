package com.fpmislata.finaljpa.domain.usecase.impl;

import java.util.List;

import org.springframework.data.convert.ReadingConverter;

import com.fpmislata.finaljpa.common.annotion.UseCase;
import com.fpmislata.finaljpa.domain.model.Author;
import com.fpmislata.finaljpa.domain.service.interfaces.AuthorService;
import com.fpmislata.finaljpa.domain.usecase.interfaces.AuthorFindAllByBookIdUseCase;

import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class AuthorFindAllByBookIdUseCaseImpl implements AuthorFindAllByBookIdUseCase {

    private final AuthorService authorService;

    @Override
    public List<Author> execute(Integer bookId) {
        return authorService.findAllByBookId(bookId);
    }
}
