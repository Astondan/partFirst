package by.cdp.jb27_les11;

import java.util.Comparator;

public class ProgrammerBook1 extends Book1 {
	private String level;
	private String author;

	public ProgrammerBook1(String title, int yearPublished, int price, String level, String author) {
		super(title, yearPublished, price);
		this.level = level;
		this.author = author;
	}

	public void setLevel() {
		this.level = level;
	}

	public String getLevel() {
		return level;
	}

	public void setAuthor() {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}
	
	
	@Override
	public String toString() {
		return "ProgrammerBook [level=" + level + ", author=" + author + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((level == null) ? 0 : level.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProgrammerBook1 other = (ProgrammerBook1) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (level == null) {
			if (other.level != null)
				return false;
		} else if (!level.equals(other.level))
			return false;
		return true;
	}

	
	
	
}