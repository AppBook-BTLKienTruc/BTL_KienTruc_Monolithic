package com.example.btlkientrucmonolithic.entity;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "authors")
public class Author implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "author_name")
	private String authorName;
	@Column(name = "author_info")
	private String authorInfo;
	@Column(name = "author_image")
	private String authorImage;
	
//	@OneToMany(mappedBy = "author")
//	private List<Book> books;

	public Author(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorInfo() {
		return authorInfo;
	}

	public void setAuthorInfo(String authorInfo) {
		this.authorInfo = authorInfo;
	}

	public String getAuthorImage() {
		return authorImage;
	}

	public void setAuthorImage(String authorImage) {
		this.authorImage = authorImage;
	}
	//
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(Integer id, String authorName, String authorInfo, String authorImage) {
		super();
		this.id = id;
		this.authorName = authorName;
		this.authorInfo = authorInfo;
		this.authorImage = authorImage;
	}

	//

	@Override
	public String toString() {
		return "Author [id=" + id + ", authorName=" + authorName + ", authorInfo=" + authorInfo + ", authorImage="
				+ authorImage  + "]";
	}
	
	
	
}
