package behavioral.observer;

import java.awt.HeadlessException;
import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

public class MyContainer extends Observable {

	private String news;
	 
    public void setNews(String news) {
        this.news = news;
        // changed the state of the container (the news attribute changed)
        this.setChanged();
        // notify the new event to list of observer listeners 
        this.notifyObservers(news);
    }
	
   //אין צורך לעשות את המתודות שלמטה זה רק כדי שיהיה מובן יותר 
    
    public void addListener (Observer toAdd) {
    	this.addObserver(toAdd);
    }
    
    public void removeListener (Observer toAdd) {
    	this.deleteObserver(toAdd);
    }
    
}
