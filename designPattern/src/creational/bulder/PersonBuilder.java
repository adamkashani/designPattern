package creational.bulder;

public class PersonBuilder {
	// Default attribute
	private Person person;

	public static PersonBuilder getPersonBuilder () {
		return new PersonBuilder();
	}

	public  PersonBuilder buildPersonName(String personName) {
		person.setName(personName);
		return this;
	}

	public PersonBuilder buildPersonObject(Object object) {
		person.setObject(object);
		return this;
	}

	public PersonBuilder buildPersonAge(int age) {
		person.setAge(age);
		return this;
	}
	//המתודה הזאת בעצם בודקת את הערכים של אותו בן אדם שיצרנו כאן נוכל לעשות מניפולציות אחרונות ליפני שנחזיר את אותו בן אדם
	public Person build() {
		// if the person age little 10 change to 25
		if (person.getAge() > 10) {
			person.setAge(25);
		}
		return person;
	}

	// create a new person to start build 
	public PersonBuilder start() {
		person = new Person();
		return this;
	}

}
