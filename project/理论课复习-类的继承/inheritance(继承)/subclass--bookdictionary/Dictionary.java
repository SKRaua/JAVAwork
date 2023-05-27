package demo10.bookdictionary;

/**
 * Represents a dictionary, which is a book with a number of definitions.
 * By default, each dictionary has 52500 definitions.
 * @author Qi Wang
 * @verion 1.0
 */
public class Dictionary extends Book{	
	/** 
	 * The number of definitions of this dictionary 
	 */
	private int definitions;
	
	/**
	 * Constructs a dictionary with 1500 pages and 52500 definitions.
	 */
	public Dictionary(){
		super();//this.pages = 1500;//parent
		this.definitions = 52500;//child
	}
	
	/**
	 * Constructs a dictionary with pages and definitions.
	 * @param pages The pages of this dictionary
	 * @param definitions The definitions of this dictionary
	 */
	public Dictionary(int pages, int definitions){
		super(pages);//this.pages = pages; //parent
		this.definitions = definitions;//child
	}


	/**
	 * Returns the number of definitions of this dictionary.
	 * @return An int value specifying the number of definitions of this dictionary
	 */
	public int getDefinitions (){
	  return this.definitions;
	}

	 /**
	  * Changes the number of definitions.
	  * @param definitions The number of definitions of this dictionary
	  */
	public void setDefinitions (int definitions){
	  this.definitions = definitions;
	}
	
	
	/**
	 * Returns the ratio of the definition and pages of this dictionary.
	 * @return A double value specifying the ratio of number of definitions and 
	 *         number of pages of this dictionary
	 */
	public double computeRatio(){
	  //return this.definitions/this.pages;
		return this.definitions/this.getPages();
	}

	/**
	 * Returns a string representation of this dictionary.
	 * @return A String specifying the pages of this dictionary
	 */
	public String toString(){ 
		return super.toString()  + ", " + 
				" Definitions: " + this.definitions;
	}
	
	/**
	 * Indicates if this dictionary is "equal to" some other object. If the other object is not a dictionary, 
	 * return false. If the other object is a dictionary, and has the same pages and definitions, return true.
	 * @param obj An Object reference to a specific object
	 * @return A boolean value specifying whether this dictionary is equal to some other object
	 */
	public boolean equals(Object obj){
		if(!(obj instanceof Dictionary))
			return false;
		
		Dictionary other = (Dictionary)obj;
		return super.equals(other)
				&& this.definitions == other.definitions;
	}
}


