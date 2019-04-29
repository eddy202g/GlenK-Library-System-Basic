package Model;

///// This class is another abstract class, again it will not be used
///// as a blueprint for an object. The purpose of this class
///// is to contain the attributes that can be shared across other 
///// subclasses that are similar, in this case printed media, 
///// so shares similar attributes between books and journals. 
///// CDs and Videos do not share these attributes. The parent class
///// cannot see these attributes but child classes can
abstract public class DigitalMedia extends Media{

///// These are the variables that will be stored in the
///// constructor, to make up the blueprint for an object.
///// These have a protected access modifier, which means
///// the information they store will be encapsulated within this 
///// superclass and its subclasses, meaning the information
///// is only visible to this class heirarchy
protected int runningTime;
protected String typeOfStorageCase;
}
