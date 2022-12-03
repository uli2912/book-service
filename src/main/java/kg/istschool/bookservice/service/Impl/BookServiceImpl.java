package kg.istschool.bookservice.service.Impl;


import kg.istschool.bookservice.mappers.BookMapper;
import kg.istschool.bookservice.model.dto.BookDTO;
import kg.istschool.bookservice.model.entity.Book;
import kg.istschool.bookservice.repository.BookRepo;
import kg.istschool.bookservice.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private BookRepo bookRepo;
    private BookMapper bookMapper;

    public BookServiceImpl(BookRepo bookRepo, BookMapper bookMapper) {
        this.bookRepo = bookRepo;
        this.bookMapper = bookMapper;
    }

    @Override
    public BookDTO save(BookDTO bookDTO) {
        Book book = bookMapper.bookDtoToBook(bookDTO);

        book = bookRepo.save(book);

        bookDTO = bookMapper.booktoBookDto(book);

        return bookDTO;
    }
}
