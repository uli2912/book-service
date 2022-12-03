package kg.istschool.bookservice.mappers;

import kg.istschool.bookservice.model.dto.AuthorDto;
import kg.istschool.bookservice.model.entity.Author;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class AuthorMapper {

    public Author authorDtoToAuthor(AuthorDto authorDto) {
        if (Objects.isNull(authorDto)){
            return null;
        }
        Author author = new Author();
        if (Objects.nonNull(authorDto.getId())) {
            author.setId(authorDto.getId());
        }
        author.setName(authorDto.getName());
        return author;

    }

    public AuthorDto authorToAuthorDto(Author author) {
        AuthorDto authorDto = new AuthorDto();
        authorDto.setId(author.getId());
        authorDto.setName(author.getName());

        return authorDto;
    }
}
