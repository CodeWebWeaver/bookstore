package com.parkhomovsky.bookstore.repository;

import com.parkhomovsky.bookstore.dto.BookSearchParameters;
import org.springframework.data.jpa.domain.Specification;

public interface SpecificationBuilder<T> {
    Specification<T> build(BookSearchParameters searchParameters);
}
