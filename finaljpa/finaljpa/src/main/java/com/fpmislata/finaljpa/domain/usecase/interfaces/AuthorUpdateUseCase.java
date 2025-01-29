package com.fpmislata.finaljpa.domain.usecase.interfaces;

import com.fpmislata.finaljpa.domain.model.Author;

public interface AuthorUpdateUseCase {
    void execute(Author author);
}