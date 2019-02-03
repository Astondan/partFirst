package by.cdp.jb27_les11;

import java.util.List;
import java.util.TreeSet;


public class Drive {
	public static void main(String[] args) {
		Library1 myLibrary = new Library1();
		
		myLibrary.add(new ProgrammerBook1("Head First Java", 2018, 250, "Junior", "Talented Person"));
		myLibrary.add(new ProgrammerBook1("Java Basic", 2020, 1450, "Advanced", "Oracle"));
		myLibrary.add(new ProgrammerBook1("SomeBook", 2019, 150, "DonKnow", "Somebody"));
		
		myLibrary.delete("Java Basic");


		ProgrammerBook1 findNote = myLibrary.findByContent("SomeBook");
		if (findNote != null) {
			printFinding(findNote);
		}
		printInList1(myLibrary);
		
}
	public static void printFinding(ProgrammerBook1 find) {
		System.out.println("Title: " + find.getTitle() + " Year Published: " + find.getYearPublished() + " Price: "
				+ find.getPrice()+ " Level: " + find.getLevel()+ " Author " + find.getAuthor());
		
	}
	
	public static void printInList1(Library1 myLibrary) {
		TreeSet<ProgrammerBook1> printProgrammerBooks = myLibrary.getProgrammerBooks();
		System.out.println("My Library(in List): ");
		for (ProgrammerBook1 elements: printProgrammerBooks) {
			System.out.println("Title: " + elements.getTitle() + " Year Published: " + elements.getYearPublished() + " Price: "
					+ elements.getPrice()+ " Level: " + elements.getLevel()+ " Author " + elements.getAuthor());
		}
	}
	
		
}