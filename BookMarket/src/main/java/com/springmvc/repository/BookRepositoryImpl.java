package com.springmvc.repository;

import java.util.List; 
import com.springmvc.domain.Book;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryImpl implements BookRepository {

	private List<Book> listOfBooks = new ArrayList<Book>();
	
	public BookRepositoryImpl() {
		Book book1 = new Book("ISBN1234", "C++책", 30000);
		book1.setAuthor("류형진");
		book1.setDescription("c++의 전체적인 내용을 설명한 책");
		book1.setPublisher("길벗");
		book1.setCategory("컴퓨터");
		book1.setUnitsInStock(1000);
		book1.setReleaseDate("2023/05/06");
		
		listOfBooks.add(book1);
	}
	
	@Override
	public List<Book> getAllBookList() { //interface implementation
		// TODO Auto-generated method stub
		return listOfBooks;
	}
	
	public List<Book> getBookListByCategory(String category){
		List <Book> booksByCategory = new ArrayList<Book>();
		
		for(int i = 0; i < listOfBooks.size(); i++) {
			Book book = listOfBooks.get(i);
			
			if(category.equalsIgnoreCase(book.getCategory())) booksByCategory.add(book);
		}
		
		return booksByCategory;
	}
}
