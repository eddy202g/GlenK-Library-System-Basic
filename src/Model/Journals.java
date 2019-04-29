package Model;


///// This class is a subclass of the superclass Media.
///// Because this class extends PrintedMedia, it automatically inherits
///// all of the parent classes attributes, from printed media and the Media 
///// superclass
public class Journals extends PrintedMedia {


///// this is an overloaded constructor. it has been loaded 
///// with parameters to be used in the object.
public Journals(String title, double costPrice, String subjectArea, String publisher, int numberPages, 
		int issn, int issueNo, String dateOfIssue)
{
	this.title = title;
	this.costPrice = costPrice;
	this.subjectArea = subjectArea;
	this.publisher = publisher;
	this.numberPages = numberPages;
	this.issn = issn;
	this.issueNo = issueNo;
	this.dateOfIssue = dateOfIssue;
	
	mediaID = mediaID + 1;
	ID = mediaID;	
	
	mediaType = "journals";
	
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
			+ "\nPrice: " + costPrice
			+ "\nSubject Area: " + subjectArea
			+ "\nPublisher: " + publisher
			+ "\nIssue Number: " + issueNo
			+ "\nNumber of Pages: " + numberPages
			+ "\nISSN: " + issn
			+ "\nDate of Issue: " + dateOfIssue + "\n"
			+ "\n======================";
}

@Override
public String toString()
{
	return "Stock ID: " + ID 
			+ "            " + "Type: " + mediaType
			+ "            " + "Title: " + title;
			 
}

public String journalDetails()
{
	return "\n======================\n"
			+ "\nStockID: " + ID
			+ "\nTitle: " + title
			+ "\nPrice: " + costPrice
			+ "\nSubject Area: " + subjectArea
			+ "\nPublisher: " + publisher
			+ "\nIssue Number: " + issueNo
			+ "\nNumber of Pages: " + numberPages
			+ "\nISSN: " + issn
			+ "\nDate of Issue: " + dateOfIssue + "\n"
			+ "\n======================";
}


}
