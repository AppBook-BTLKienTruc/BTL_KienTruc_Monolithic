package com.example.btlkientrucmonolithic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.btlkientrucmonolithic.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>{

}
