package creational.bulder;

public class Person {

	private String name;

	private Object object;

	private int age;

	public Person(String name, Object object, int age) {
		super();
		this.name = name;
		this.object = object;
		this.age = age;
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", object=" + object + ", age=" + age + "]";
	}

}
