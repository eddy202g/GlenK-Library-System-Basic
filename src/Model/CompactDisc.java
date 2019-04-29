package Model;



///// This class is a subclass of the superclass Media.
///// Because this class extends PrintedMedia, it automatically inherits
///// all of the parent classes attributes, from printed media and the Media 
///// superclass
public class CompactDisc extends DigitalMedia{

private int runningTime;
private int numberOfTracks;
private String artist;



///// this is an overloaded constructor. it has been loaded 
///// with parameters to be used in the object.
public CompactDisc(String title, String artist, Double costPrice,int runningTime, 
						String typeOfStorageCase, String publisher, int numberOfTracks)
{
	this.runningTime = runningTime;
	this.numberOfTracks = numberOfTracks;
	this.artist = artist;
	this.title = title;
	this.costPrice = costPrice;
	this.publisher = publisher;
	this.typeOfStorageCase = typeOfStorageCase;
	
	mediaID = mediaID + 1;
	ID = mediaID;
	
	mediaType = "cds";
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
			+ "\nArtist: " + artist
			+ "\nRetail Price: " + costPrice
			+ "\nRunning Time: " + runningTime + " mins"
			+ "\nType of Storage Case: " + typeOfStorageCase
			+ "\nPublisher: " + publisher
			+ "\nNumber of Tracks: " + numberOfTracks + "\n"
			+ "\n======================";
		
}

@Override
public String toString()
{
	return "Stock ID: " + ID 
			+ "            " + "Type: " + mediaType
			+ "            " + "Title: " + title;
			 
}

public String cdDetails()
{
	
	return "\n======================\n"
			+ "\nStockID: " + ID
			+ "\nTitle: " + title
			+ "\nArtist: " + artist
			+ "\nRetail Price: " + costPrice
			+ "\nRunning Time: " + runningTime + " mins"
			+ "\nType of Storage Case: " + typeOfStorageCase
			+ "\nPublisher: " + publisher
			+ "\nNumber of Tracks: " + numberOfTracks + "\n"
			+ "\n======================";
		
}
}
