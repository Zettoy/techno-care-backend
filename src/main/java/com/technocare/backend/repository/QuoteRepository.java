package com.technocare.backend.repository;

import com.technocare.backend.domain.Quote;
import org.springframework.data.repository.CrudRepository;

public interface QuoteRepository extends CrudRepository<Quote, Long> {
}
