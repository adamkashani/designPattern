package creational.singleton;


// want we create singleton with enum we have guaranteed from java only one instance create 
public enum EnumSingleton {

	INSTANCE("mySingleton");

	private String name;

	private EnumSingleton(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
