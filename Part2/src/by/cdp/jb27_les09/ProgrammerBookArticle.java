package by.cdp.jb27_les09;

public class ProgrammerBookArticle extends ProgrammerBook {
	private String editor;

	public ProgrammerBookArticle(String title, int yearPublished, int price, String level, String author,
			String editor) {
		super(title, yearPublished, price, level, author);
	}

	public void setEditor() {
		this.editor = editor;
	}

	public String getEditor() {
		return editor;
	}

}
