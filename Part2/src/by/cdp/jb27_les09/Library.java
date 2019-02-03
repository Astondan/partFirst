package by.cdp.jb27_les09;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Library {
	private List<ProgrammerBook> ProgrammerBookes = new ArrayList<ProgrammerBook>();


	public Library() {
	}

	public List<ProgrammerBook> getProgrammerBooks() {
		return ProgrammerBookes;
	}

	public void add(ProgrammerBook ProgrammerBook) {
		ProgrammerBookes.add(ProgrammerBook);
	}

	public void delete(String toDelete) {
		ProgrammerBook b = null;
		for (ProgrammerBook bookToDelete: ProgrammerBookes) {
			if (bookToDelete.getTitle().equals(toDelete)) {
				b = bookToDelete;
				break;
	        }
		}
		ProgrammerBookes.remove(b);
		
	}
	

	public ProgrammerBook findByContent(String content) {
		for (ProgrammerBook ProgrammerBook : ProgrammerBookes) {
			if (ProgrammerBook.getTitle().equals(content)) {
				return ProgrammerBook;
			}
		}
		return null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ProgrammerBookes == null) ? 0 : ProgrammerBookes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		if (ProgrammerBookes == null) {
			if (other.ProgrammerBookes != null)
				return false;
		} else if (!ProgrammerBookes.equals(other.ProgrammerBookes))
			return false;
		return true;
	}

}