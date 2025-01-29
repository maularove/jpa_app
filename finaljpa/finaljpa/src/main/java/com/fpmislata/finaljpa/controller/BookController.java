package com.fpmislata.finaljpa.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpmislata.finaljpa.domain.model.Author;
import com.fpmislata.finaljpa.domain.usecase.interfaces.AuthorFindAllByBookIdUseCase;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/books")
public class BookController {

    private final AuthorFindAllByBookIdUseCase authorFindAllByBookIdUseCase;

    @GetMapping("/{bookId}/authors")
    public List<Author> findAllByBookId(@PathVariable Integer bookId) {
        return authorFindAllByBookIdUseCase.execute(bookId);
    }
}
