package by.cdp.jb27_les11;

import java.util.TreeSet;

public class Library1 {
	private TreeSet<ProgrammerBook1> ProgrammerBookes = new TreeSet<ProgrammerBook1>(new Book1DateComparator());


	public Library1() {
	}

	public TreeSet<ProgrammerBook1> getProgrammerBooks() {
		return ProgrammerBookes;
	}

	public void add(ProgrammerBook1 ProgrammerBook) {
		ProgrammerBookes.add(ProgrammerBook);
	}

	public void delete(String toDelete) {
		ProgrammerBook1 b = null;
		for (ProgrammerBook1 bookToDelete: ProgrammerBookes) {
			if (bookToDelete.getTitle().equals(toDelete)) {
				b = bookToDelete;
				break;
	        }
		}
		ProgrammerBookes.remove(b);
		
	}
	

	public ProgrammerBook1 findByContent(String content) {
		for (ProgrammerBook1 ProgrammerBook : ProgrammerBookes) {
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
		Library1 other = (Library1) obj;
		if (ProgrammerBookes == null) {
			if (other.ProgrammerBookes != null)
				return false;
		} else if (!ProgrammerBookes.equals(other.ProgrammerBookes))
			return false;
		return true;
	}

}