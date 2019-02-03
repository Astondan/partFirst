package by.cdp.jb27_les12;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class New {

	public static void main(String[] args) throws Exception {

		Importer();

	}

	public static void Importer() throws Exception {

		FileReader fr = new FileReader("text1.txt");
		Scanner sc = new Scanner(fr);
		String Title = "";
		String Author = "";
		String Price = "";
		String yearPublished = "";
		String Level = "";
		

		
		
		List<ImportedProgrammerBook> importedProgrammerBooks = new ArrayList<ImportedProgrammerBook>();
		List<String> names = new ArrayList<String>();

		if (sc.hasNextLine()) {
			for (int b = 1; b < 2; b++) {
				String name;
				name=names.get(b);
				ImportedProgrammerBook name = new ImportedProgrammerBook();
				
			}

			ImportedProgrammerBook book1 = new ImportedProgrammerBook();
			for (int i = 1; i < 6; i++) {

				switch (i) {

				case 1:
					Title = sc.nextLine();
					break;

				case 2:
					yearPublished = sc.nextLine();
					break;

				case 3:
					Price = sc.nextLine();
					break;

				case 4:
					Level = sc.nextLine();
					break;

				case 5:
					Author = sc.nextLine();
				}

				book1.setTitle(Title);
				book1.setYearPublished(yearPublished);
				book1.setPrice(Price);
				book1.setAuthor(Author);
				book1.setLevel(Level);
				importedProgrammerBooks.add(book1);
			}
			System.out.println(importedProgrammerBooks);
		} else {
			sc.next();
		}
		fr.close();
	}
}