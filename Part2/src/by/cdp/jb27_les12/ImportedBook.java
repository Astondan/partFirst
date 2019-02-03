package by.cdp.jb27_les12;


public class ImportedBook {

		protected String title;
		protected String yearPublished;
		protected String price;

		public ImportedBook() {
		}

		public ImportedBook(String title, String yearPublished, String price) {
			this.title = title;
			this.yearPublished = yearPublished;
			this.price = price;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getYearPublished() {
			return yearPublished;
		}

		public void setYearPublished(String yearPublished) {
			this.yearPublished = yearPublished;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

}
		