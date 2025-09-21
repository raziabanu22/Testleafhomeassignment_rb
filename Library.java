package week2.day1;

public class Library {

	public String Library(String bookTitle) {

	    System.out.println(bookTitle);
		return(bookTitle);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library addBook = new Library();
		addBook.Library("Book added successfully");
		addBook.issueBook();

	}

	public void issueBook() {
		// TODO Auto-generated method stub
		System.out.println("Book issued successfully");
	}

}