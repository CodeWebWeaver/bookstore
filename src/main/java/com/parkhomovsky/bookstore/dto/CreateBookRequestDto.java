package com.parkhomovsky.bookstore.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;
import lombok.Data;
import org.hibernate.validator.constraints.ISBN;
import org.hibernate.validator.constraints.URL;

@Data
public class CreateBookRequestDto {
    @NotNull(message = "Title cannot be null")
    @Size(min = 2, max = 255, message = "Title must be between 2 and 255 characters")
    private String title;
    @NotNull(message = "Author cannot be null")
    @Size(min = 2, max = 255, message = "Author must be between 2 and 255 characters")
    private String author;
    @NotNull(message = "ISBN cannot be null")
    @ISBN(message = "Invalid ISBN format")
    private String isbn;
    @NotNull(message = "Price cannot be null")
    @DecimalMin(value = "0.00", message = "Price must be greater than or equal to 0.00")
    private BigDecimal price;
    @Size(max = 1000, message = "Description must be less than or equal to 1000 characters")
    private String description;
    @URL(message = "Invalid URL format")
    private String coverImage;
}
