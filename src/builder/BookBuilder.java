package builder;

public class BookBuilder {
	
	public Book book;
	
	public BookBuilder(){
		book = new Book();
	}

	public void reset() {
		this.book = new Book();
	}
	

	public BookBuilder setTitle(String title) {
		this.book.setTitle(title);
		return this;
	}
	
	public BookBuilder setAuthor(String author) {
		this.book.setAuthor(author);
		return this;
	}

	public BookBuilder setYear(int year) {
		this.book.setYear(year);
		return this;
		
	}
	
	public Book build() {
		return this.book;
	}

}
