package kg.istschool.bookservice.service;

import kg.istschool.bookservice.model.dto.BookDTO;
import org.springframework.stereotype.Service;




public interface BookService {

    BookDTO save(BookDTO bookDTO);
}
