package creational.bulder;

public class Main {

	public static void main(String[] args) {
		Object object = new Object();

		PersonBuilder personBuilder =  PersonBuilder.getPersonBuilder();
		Person p1 = personBuilder.start().buildPersonAge(10).buildPersonName("adam").buildPersonObject(object).build();
		System.out.println(p1);
		Person p2 = personBuilder.start().buildPersonAge(10).buildPersonObject(object).build();
		System.out.println(p2);
		Person p3 = personBuilder.start().buildPersonAge(10).buildPersonName("dani").build();
		System.out.println(p3);
		Person p4 = personBuilder.start().buildPersonName("israel").buildPersonObject(object).build();
		System.out.println(p4);

	}

}
