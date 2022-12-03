package kg.istschool.bookservice.model.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Entity
@Table (name = "books")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {
    @Id
            @GeneratedValue(
                    strategy = GenerationType.SEQUENCE,
                    generator = "author_seq")
            @SequenceGenerator(name = "author_seq",
            sequenceName = "author_sequence")
    Long id;
    String name;
    @ManyToOne
            @JoinColumn(name = "author_id")
    Author author;
}
