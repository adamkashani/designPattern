package behavioral.observer;

import java.util.Observer;

public class Test {

	public static void main(String[] args) {

		Observer observer1 = new MyObserver();
		Observer observer2 = new MyObserver();
		MyContainer myContainer = new MyContainer();
		
		myContainer.addListener(observer1);
		myContainer.addListener(observer1);
		myContainer.addListener(observer2);
		myContainer.setNews("testing");
	}

}
