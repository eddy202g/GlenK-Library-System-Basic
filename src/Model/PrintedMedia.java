package Model;

///// This class is another abstract class, again it will not be used
///// as a blueprint for an object. The purpose of this class
///// is to contain the attributes that can be shared across other 
///// subclasses that are similar, in this case printed media, 
///// so shares similar attributes between books and journals. 
///// CDs and Videos do not share these attributes. The parent class
///// cannot see these attributes but child classes can
abstract public class PrintedMedia extends Media
{
	///// These are the variables that will be stored in the
	///// constructor, to make up the blueprint for an object.
	///// These have a protected access modifier, which means
	///// the information they store will be encapsulated within this 
	///// superclass and its subclasses, meaning the information
	///// is only visible to this class heirarchy
	protected String subjectArea;
	protected int numberPages;
	protected String author;
	protected String isbn = "";
	protected int issn = 0;
	protected int issueNo = 0;
	protected String dateOfIssue = "";
	
	///// The following methods are a series of getters, 
	///// which store certain information within a variable, and then they 
	///// can be accessed as parameters of an object from the controller.
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getIssueNo() {
		return issueNo;
	}
	public void setIssueNo(int issueNo) {
		this.issueNo = issueNo;
	}
	
	public int getIssn() {
		return issn;
	}
	public void setIssn(int issn) {
		this.issn = issn;
	}

}
