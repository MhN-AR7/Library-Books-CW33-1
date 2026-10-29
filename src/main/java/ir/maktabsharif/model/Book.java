package ir.maktabsharif.model;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@ToString
public class Book {
    private String title;

    private String author;

    private BigDecimal price;
}
