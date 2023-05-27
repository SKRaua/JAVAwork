package demo10.bookdictionary;

/**
 * Represents a book with a number of pages.
 * By default, every book has 1500 pages. 
 * @author Qi Wang
 * @version 1.0
 */
public class Book{
	/** 
	 * The pages of this book 
	 */
	private int pages;
	
	/**
	 * Constructs a book with the default of 1500 pages.
	 */
	public Book(){
		this.pages = 1500;
	}
	
	/**
	 * Constructs a book with pages.
	 * @param pages The pages of this book
	 */
	public Book(int pages){
		this.pages = pages;
	}


	/**
	 * Returns the pages of this book.
	 * @return An integer specifying the pages of this book
	 */
	public int getPages (){
	  return this.pages;
	}
	
	/**
	 * Changes the pages of this book.
	 * @param pages The pages of this book
	 */
	public void setPages (int pages){
	  this.pages = pages;
	}
	
	/**
	 * Returns a string representation of this book.
	 * @return A String specifying the pages of this book
	 */
	public String toString(){
		return this.getClass().getSimpleName() + ", Pages: " + this.pages;
	}
	
	/**
	 * Indicates if this book is "equal to" some other object. If the other object is not a book, 
	 * return false. If the other object is a book, and has the same pages, return true.
	 * @param obj An Object reference to a specific object
	 * @return A boolean value specifying whether this book is equal to some other object
	 */
	public boolean equals(Object obj){
		if(!(obj instanceof Book))
			return false;
		
		Book other = (Book)obj;
		return this.pages == other.pages;
	}
}

