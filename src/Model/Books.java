package Model;

///// This class is a subclass of the superclass Media.
///// Because this class extends PrintedMedia, it automatically inherits
///// all of the parent classes attributes, from printed media and the Media 
///// superclass
public class Books extends PrintedMedia 
{

///// this is an overloaded constructor. it has been loaded 
///// with parameters to be used in the object.
public Books(String title, String author, double costPrice, String subjectArea, String publisher, int numberPages, 
			String isbn)
{
	this.title = title;
	this.costPrice = costPrice;
	this.subjectArea = subjectArea;
	this.publisher = publisher;
	this.numberPages = numberPages;
	this.author = author;
	this.isbn = isbn;
	
	mediaID = mediaID + 1;
	ID = mediaID;
	
	mediaType = "books";
	
}


///// This is an example of method overriding.
///// The initial method was writtin in the superclass, 
///// therefore the subclass inherits the method and can be used to 
///// store seperate details from all of the other
///// subclasses
@Override
public String details()
{
	return "\n======================\n"
			+ "\nStockID: " + ID
			+ "\nTitle: " + title
			+ "\nAuthor: " + author
			+ "\nRetail Price: " + costPrice
			+ "\nGenre: " + subjectArea
			+ "\nPublisher: " + publisher
			+ "\nNumber of Pages: " + numberPages
			+ "\nISBN: " + isbn + "\n"
			+ "\n======================";
}

@Override
public String toString()
{
	return "Stock ID: " + ID 
			+ "            " + "Type: " + mediaType
			+ "            " + "Title: " + title;
			 
}

public String bookDetails()
{
	return "\n======================\n"
			+ "\nStockID: " + ID
			+ "\nTitle: " + title
			+ "\nAuthor: " + author
			+ "\nRetail Price: " + costPrice
			+ "\nGenre: " + subjectArea
			+ "\nPublisher: " + publisher
			+ "\nNumber of Pages: " + numberPages
			+ "\nISBN: " + isbn + "\n"
			+ "\n======================";
}
}
