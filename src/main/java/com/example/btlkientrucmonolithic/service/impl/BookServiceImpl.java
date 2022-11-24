package com.example.btlkientrucmonolithic.service.impl;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.example.btlkientrucmonolithic.entity.Book;
import com.example.btlkientrucmonolithic.repository.BookRepository;
import com.example.btlkientrucmonolithic.service.BookService;

@Transactional
@Service
public class BookServiceImpl implements BookService{
	
	private static final String BOOK = "Book";
	
	private RedisTemplate<String, Object> redisTemplate;
	
	private HashOperations<String, Integer,Book> hashOperations;

//	@Autowired
//	private BookRepository bookRepository;
	
	@PostConstruct
	public void init() {
		this.hashOperations = redisTemplate.opsForHash();
	}
	
	@Override
	public List<Book> findAll() {
		return hashOperations.multiGet(BOOK, null);
	}

	@Override
	public Book findById(int maTim) {
		Optional<Book> result = Optional.of(hashOperations.get(BOOK,maTim));
		Book book = null;
		if (result.isPresent()) {
			book = result.get();
		}else {
			throw new RuntimeException("Khong tim thay ma: "+ maTim);
		}
		return book;
	}

	@Override
	public Book save(Book book) {
		 hashOperations.put(BOOK, book.getId(), book);
		 return book;
	}

	@Override
	public void delete(int maXoa) {
		hashOperations.delete(BOOK, maXoa);
	}

}
