package com.SpActuatorsLab.SpActuatorsLab.actuator;

import com.SpActuatorsLab.SpActuatorsLab.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
@Endpoint(id = "book-count")
public class BookCountEndpoint {

    private static final Logger logger = LoggerFactory.getLogger(BookCountEndpoint.class);

    private final BookRepository bookRepository;

    @Autowired
    public BookCountEndpoint(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @ReadOperation
    public String getBookCount() {
        long count = bookRepository.count();
        logger.info("Fetching total number of books: {}", count);
        return "Total number of books: " + count;
    }

}
