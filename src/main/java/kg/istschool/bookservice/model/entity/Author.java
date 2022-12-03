package kg.istschool.bookservice.model.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;



@Entity
@Getter
@Setter
@Table (name = "authors")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Author {
    @Id
            @GeneratedValue(
                    strategy = GenerationType.SEQUENCE,
                    generator = "author_seq"
            )
            @SequenceGenerator(
                    name = "authors_seq",
                    sequenceName = "author_sequence",
                    initialValue = 1,
                    allocationSize = 50
            )

    Long id;
    String name;

}
