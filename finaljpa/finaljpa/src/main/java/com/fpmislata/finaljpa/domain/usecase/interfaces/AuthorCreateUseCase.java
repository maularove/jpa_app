package com.fpmislata.finaljpa.domain.usecase.interfaces;

import com.fpmislata.finaljpa.domain.model.Author;

public interface AuthorCreateUseCase {
    void execute(Author author);
}