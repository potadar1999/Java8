package com.Que4;

import java.util.ArrayList;
import java.util.List;

public class Library {

 static ArrayList<Books> bookList = new ArrayList<>();
	
  void addBook(Books books) {
      bookList.add(books);
  }
  
  boolean isEmapty() {
	  return bookList.isEmpty();
	  
  }
  
  List<Books> viewBooksByAuthor(String author ) {

       List<Books> list = new ArrayList<>();
       
       for(Books b:bookList) {
    	     if(b.getAuthor().equalsIgnoreCase(author)) {
    	    	 list.add(b);
    	     }
    	     else {
    	    	 System.out.println("The list is empty");
    	     }
    	    
    	    	 
       }
       return list;
       

  }
  
  int countNoOfBook(String bookName) {
	  int count=0;
	  for(Books b:bookList) {
 	     if(b.getBookName().equalsIgnoreCase(bookName)) {
 	    	 count++;
 	     }
 	     
    }
	  return count;
  }


}
