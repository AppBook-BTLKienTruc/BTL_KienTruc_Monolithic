package com.example.btlkientrucmonolithic.service;

import java.util.List;

import com.example.btlkientrucmonolithic.entity.Author;

public interface AuthorService {

	public List<Author> findAll();
	public Author findById(int maTim);
	public void save(Author author);
	public void delete (int maXoa);
}
