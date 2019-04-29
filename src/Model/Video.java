package Model;


///// This class is a subclass of the superclass Media.
///// Because this class extends PrintedMedia, it automatically inherits
///// all of the parent classes attributes, from printed media and the Media 
///// superclass
public class Video extends DigitalMedia
{
private String videoFormat;
private String genre;

///// this is an overloaded constructor. it has been loaded 
///// with parameters to be used in the object.
public Video(int runningTime, String videoFormat, String genre, 
						String title, Double costPrice, String publisher, String typeOfStorageCase)
{
	this.runningTime = runningTime;
	this.videoFormat = videoFormat;
	this.genre = genre;
	this.title = title;
	this.costPrice = costPrice;
	this.publisher = publisher;
	this.typeOfStorageCase = typeOfStorageCase;
	
	mediaID = mediaID + 1;
	ID = mediaID;
	
	mediaType = "video";
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
			+ "\nRunning Time: " + runningTime
			+ "\nVideo Format: " + videoFormat + " mins"
			+ "\nGenre: " + genre
			+ "\nRetail Price: " + costPrice 
			+ "\nPublisher: " + publisher
			+ "\nType of Storage Case: " + typeOfStorageCase + "\n"
			+ "\n======================";

}

@Override
public String toString()
{
	return "Stock ID: " + ID 
			+ "            " + "Type: " + mediaType
			+ "            " + "Title: " + title;
			 
}

public String videoDetails()
{
	
	return "\n======================\n"				
			+ "\nStockID: " + ID
			+ "\nTitle: " + title
			+ "\nRunning Time: " + runningTime
			+ "\nVideo Format: " + videoFormat + " mins"
			+ "\nGenre: " + genre
			+ "\nRetail Price: " + costPrice 
			+ "\nPublisher: " + publisher
			+ "\nType of Storage Case: " + typeOfStorageCase + "\n"
			+ "\n======================";

}

}
