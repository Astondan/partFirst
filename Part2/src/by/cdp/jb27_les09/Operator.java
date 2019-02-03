package by.cdp.jb27_les09;

import java.util.List;
import java.util.TreeSet;

public class Operator {

	public static void main(String[] args) {
		Library myLibrary = new Library();
		
		myLibrary.add(new ProgrammerBook("Head First Java", 2018, 250, "Junior", "Talented Person"));
		myLibrary.add(new ProgrammerBook("Java Basic", 2017, 50, "Advanced", "Oracle"));
		myLibrary.add(new ProgrammerBook("SomeBook", 2019, 150, "DonKnow", "Somebody"));
		myLibrary.delete("Head First Java");
		
		
		ProgrammerBook findNote = myLibrary.findByContent("Java Basic");
		if (findNote != null) {
			printInList(findNote);
		}

		printInList(myLibrary);
		printInTable(myLibrary);
		
	}

	public static void printInList(Library myLibrary) {
		List<ProgrammerBook> printProgrammerBooks = myLibrary.getProgrammerBooks();
		System.out.println("My Library(in List): ");
		for (int i = 0; i < printProgrammerBooks.size(); i++) {
			ProgrammerBook book = printProgrammerBooks.get(i);
			printInList(book);
		}
	}

	public static void printInList(ProgrammerBook book) {
		System.out.println("Title: " + book.getTitle() + " Year Published: " + book.getYearPublished() + " Price: "
				+ book.getPrice()+ " Level: " + book.getLevel()+ " Author " + book.getAuthor());
	}
	
	public static void printInTable(Library myLibrary) {
		List<ProgrammerBook> printProgrammerBooks = myLibrary.getProgrammerBooks();
		System.out.println("My Library(in Table): ");
		for (int i = 0; i < printProgrammerBooks.size(); i++) {
			ProgrammerBook book = printProgrammerBooks.get(i);
			printInTable(book);
		}
	}

	public static void printInTable(ProgrammerBook book) {
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("|Title: " + book.getTitle() + " |Year Published: " + book.getYearPublished() + " |Price: "
				+ book.getPrice()+ " |Level: " + book.getLevel()+ " |Author " + book.getAuthor()+ " |");

	}
	
}
