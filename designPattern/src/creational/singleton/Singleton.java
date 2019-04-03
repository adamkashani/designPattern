package creational.singleton;

public class Singleton {

	//Agar
	//	private static Singleton instance = new Singleton();

	//lazy
	private static Singleton instance ;

	private Singleton () {};

	public static Singleton getIntense() {

		if (instance==null) {
			synchronized (Singleton.class) {
				instance = new Singleton();
			}
		}
		return instance;
	}

}
