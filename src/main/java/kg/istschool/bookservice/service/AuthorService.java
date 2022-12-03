package kg.istschool.bookservice.service;

import kg.istschool.bookservice.model.dto.AuthorDto;

public interface AuthorService {
    AuthorDto save(AuthorDto authorDto);
}
