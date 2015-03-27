/**
 * Elohe Yonas
 * CSC201
 * the program will focus on 3 properties of books; the average pages for it's type, the audience intended, and the contents associated with said type.
 * class Bookproperties will carry these three properties for book types to inheret.
 * there will be 3 booktype to showcase Bookproperties: Novel, dictionary, and Textbook.
 * each booktype will have their own set of values using the same basis of bookproperties
 *
 */
public class Bookproperties {
private int averagepages;
private String audience;
private String contents;

 Bookproperties(){
	
}

protected Bookproperties(int averagepages, String audience, String contents)
{
	this.averagepages = averagepages;
	this.audience = audience;
	this.contents = contents;
}
public String toString(){
	return "the average pages of this type of literatures is " + averagepages + ", the contents of this literature are often" + contents +
			", and the audience for this type of literature is focused on"
			+ audience;
			
}
}
