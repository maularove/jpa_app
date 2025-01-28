package com.fpmislata.finaljpa.persistence.jpa.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.fpmislata.finaljpa.domain.model.Author;
import com.fpmislata.finaljpa.persistence.jpa.entity.AuthorEntity;

@Mapper
public interface AuthorDaoMapper {

    AuthorDaoMapper INSTANCE = Mappers.getMapper(AuthorDaoMapper.class);

    Author toAuthor(AuthorEntity authorEntity);

    AuthorEntity toAuthorEntity(Author author);

    List<Author> toAuthors(List<AuthorEntity> authorEntities);

    List<AuthorEntity> toAuthorEntities(List<Author> authors);
}