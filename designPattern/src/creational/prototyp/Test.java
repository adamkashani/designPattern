package creational.prototyp;

public class Test {

	public static void main(String[] args) {


		Prototyp prototyp = new Prototyp();
		prototyp.getStrings().add("aaaa");
		prototyp.getStrings().add("bbbb");
		prototyp.getStrings().add("cccc");

		prototyp.setName("stamm");
		try {
			Prototyp copy = prototyp.clone();
			prototyp.getStrings().remove("aaaa");
			System.out.println("the copy object : "+copy);
			System.out.println( "the rel object : "+prototyp);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
