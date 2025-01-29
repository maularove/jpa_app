package com.fpmislata.finaljpa.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpmislata.finaljpa.domain.model.Author;
import com.fpmislata.finaljpa.domain.usecase.interfaces.AuthorCreateUseCase;
import com.fpmislata.finaljpa.domain.usecase.interfaces.AuthorDeleteUseCase;
import com.fpmislata.finaljpa.domain.usecase.interfaces.AuthorFindAllUseCase;
import com.fpmislata.finaljpa.domain.usecase.interfaces.AuthorFindByIdUseCase;
import com.fpmislata.finaljpa.domain.usecase.interfaces.AuthorUpdateUseCase;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorFindAllUseCase authorFindAllUseCase;
    private final AuthorFindByIdUseCase authorFindByIdUseCase;
    private final AuthorCreateUseCase authorCreateUseCase;
    private final AuthorUpdateUseCase authorUpdateUseCase;
    private final AuthorDeleteUseCase authorDeleteUseCase;

    @GetMapping()
    public ResponseEntity<List<Author>> findAll() {
        List<Author> authors = authorFindAllUseCase.execute();

        return ResponseEntity.ok(authors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Author> findById(@PathVariable Integer id) {
        Author author = authorFindByIdUseCase.execute(id);

        return ResponseEntity.ok(author);
    }

    @PostMapping()
    public ResponseEntity<Void> create(@Valid @RequestBody Author author) {
        authorCreateUseCase.execute(author);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable Integer id, @Valid @RequestBody Author author) {
        author.setId(id);
        authorUpdateUseCase.execute(author);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        authorDeleteUseCase.execute(id);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}