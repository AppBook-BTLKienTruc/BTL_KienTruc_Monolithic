package com.example.btlkientrucmonolithic.service;

import java.util.List;

import com.example.btlkientrucmonolithic.entity.Book;

public interface BookService {

	public List<Book> findAll();
	public Book findById(int maTim);
	public Book save(Book book);
	public void delete (int maXoa);
}
