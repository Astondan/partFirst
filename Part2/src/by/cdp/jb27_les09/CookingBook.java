package by.cdp.jb27_les09;

public class CookingBook extends Book {
	private String nationality;
	private String level;
	private String author;
	public CookingBook(String title, int yearPublished, int price, String nationality, String level, String author) {
		super(title, yearPublished, price);
		this.nationality = nationality;
		this.level=level;
		this.author=author;
			}
	public String getLevel(){
			return level;
			}
	public String getNationality(){
		return nationality;
	}
	public String getAuthor(){
		return author;
	}
}