package main;

import java.util.Scanner;

import builder.Book;
import builder.BookBuilder;
import db.SingletonDatabase;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	SingletonDatabase db = SingletonDatabase.getInstance();

	public void inputBook() {
		BookBuilder bb = new BookBuilder();
		Book b = new Book();
		
		String title, author = null;
		int year = 0;
		
		
		do {
//			String title = null;
			System.out.print("Input Book Title : ");
			title = sc.nextLine();
			b = bb.setTitle(title);
		}while(title.isEmpty());
		do {
//			String author = null;
			System.out.print("Input Author Name : ");
			author = sc.nextLine();
			
		}while(author.isEmpty());
		do {
//			int year = 0;
			System.out.print("Input Year Published : ");
			year = sc.nextInt();
			
		}while(year < 0);
		
		

		
		db.getTitle().add(
				"Title            : " + b.getTitle() + 
				"\nAuthor Name   :" + b.getAuthor() +
				"\n Year Publish :" + b.getYear()
				);
		
		
		
	}
	
	public void view() {
		if(db == null) {
			System.out.println("==Empty==");
			sc.nextLine();
			return;
		}
		
		for(String title:db.getTitle()) {
			System.out.println(title);
			
		}
	}
	
	public Main() {
	
		int menu = 0;
		do {
			System.out.println("Toko Buku Bahagia");
			System.out.println("=================");
			System.out.println("1. Input Book");
			System.out.println("2. View Book");
			System.out.println("3. Exit");
			System.out.print(">>");
			
			menu = sc.nextInt();
			
			if(menu == 1) {
				inputBook();
			}else if(menu == 2) {
				view();
			}
			
		}while(menu != 3);
		
		
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
