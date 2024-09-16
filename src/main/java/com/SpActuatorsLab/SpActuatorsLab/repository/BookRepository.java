package com.SpActuatorsLab.SpActuatorsLab.repository;

import com.SpActuatorsLab.SpActuatorsLab.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitle(String title);
}