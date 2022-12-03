package kg.istschool.bookservice.service.Impl;

import kg.istschool.bookservice.mappers.AuthorMapper;
import kg.istschool.bookservice.model.dto.AuthorDto;
import kg.istschool.bookservice.model.entity.Author;
import kg.istschool.bookservice.repository.AuthorRepo;
import kg.istschool.bookservice.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepo authorRepo;

    private AuthorMapper authorMapper;

    @Autowired
    public AuthorServiceImpl(AuthorRepo authorRepo, AuthorMapper authorMapper) {
        this.authorRepo = authorRepo;
        this.authorMapper = authorMapper;
    }

    @Override
    public AuthorDto save(AuthorDto authorDto) {
        Author author = authorMapper.authorDtoToAuthor(authorDto);

        author = authorRepo.save(author);

        authorDto = authorMapper.authorToAuthorDto(author);

        return authorDto;
    }

    @PutMapping("/update")
    public  AuthorDto update(@RequestBody AuthorDto authorDto) {
        return authorDto;

    }
}
