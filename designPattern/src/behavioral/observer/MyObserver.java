package behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer{

	private String news;
	
	// this method run every time the MyContainer state has change and here we can do callback to handle the event  
	@Override
	public void update(Observable conatiner, Object newEvent) {
		this.setNews((String)newEvent);
		System.out.println("from observer : toString "+this.toString() +" the new event send " + this.news);
	}

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}
	
}
