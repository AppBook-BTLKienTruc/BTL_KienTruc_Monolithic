package com.example.btlkientrucmonolithic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.btlkientrucmonolithic.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
