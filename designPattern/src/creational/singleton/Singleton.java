package creational.singleton;

public class Singleton {

	//Eager
	//	private static Singleton instance = new Singleton();

	//lazy
	private static Singleton instance ;

	private Singleton () {};

	public static Singleton getInstance() {

		if (instance==null) {
			synchronized (Singleton.class) {
				instance = new Singleton();
			}
		}
		return instance;
	}

}
