
/**
 * Write a description of class car here.
 *
 * @author Monika
 * @version 1.0 September 15, 2018
 * The Book Class
 */
public class Book
{
    // instance variables - replace the example below with your own
    private String  title;
    private String  lastName;
    private int     yearPublished;

    /**
     * Constructor for objects of class Book
     * 
     * @param title is the title of the book
     * @param lastName is the last name of the Author
     * @param yearPublished is the year when the book was published
     * 
     */
    public Book(String theTitle, String theLastName, int theYearPublished)
    {
        if(theTitle != null){
            title = theTitle;
        }
        else {
            throw new IllegalArgumentException("Title Cannot Be Null!");
        }

        if(theLastName !=null){
            lastName = theLastName;
        }
        else{
            throw new IllegalArgumentException("The Last Name Cannot Be Null");
        }

        if((theYearPublished>=1455) && (theYearPublished<=2018)){
            yearPublished = theYearPublished;
        }
        else{
            throw new IllegalArgumentException("The Year Published is out of range");
        }
    }

}