package com.fpmislata.finaljpa.domain.usecase.interfaces;

import java.util.List;

import com.fpmislata.finaljpa.domain.model.Author;

public interface AuthorFindAllByBookIdUseCase {

    List<Author> execute(Integer bookId);
}