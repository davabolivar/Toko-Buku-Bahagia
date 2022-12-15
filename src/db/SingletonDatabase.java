package db;

import java.util.ArrayList;

public class SingletonDatabase {
	
	private static SingletonDatabase instance = null;
	private ArrayList<String> title = new ArrayList<>();

	public static SingletonDatabase getInstance() {
		if(instance == null) {
			synchronized (SingletonDatabase.class) {
				if(instance == null) {
					instance = new SingletonDatabase();
				}
			}
		}
		return instance;	
	}

	public ArrayList <String> getTitle(){
		return title;
	}
}
