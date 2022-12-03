package kg.istschool.bookservice.controller;


import kg.istschool.bookservice.model.dto.AuthorDto;
import kg.istschool.bookservice.service.AuthorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/author")
public class AuthorController {

    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping("/save")
    public AuthorDto save(@RequestBody AuthorDto authorDto) {
    return authorService.save(authorDto);

//    @GetMapping("/list")
//            public List<AuthorDto> getAuthors() {
//        return null;
//        }
}
}
