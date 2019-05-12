package creational.prototyp;

import java.util.ArrayList;
import java.util.List;


//if we wont for this class have function to create a clone we must implements Cloneable interface else this method throw exception
public class Prototyp implements Cloneable {


	private String name; 
	private Object object;
	private List<String>strings = new ArrayList<>();




//	//if we wont to copy all property include the object we need to override the clone method
	@Override
	protected Prototyp  clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Prototyp copy = (Prototyp) super.clone();
		copy.setStrings(new ArrayList<>(this.strings));  
		return copy;
	}
	
	
	//the default of this method copy only the primitive types and give referents to object and don't create a new object and copy hem 
	//if we wont to copy all attribute we need to override the clone method
//	@Override
//	protected Prototyp  clone() throws CloneNotSupportedException {
//		return (Prototyp) super.clone();
//	}




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




	public List<String> getStrings() {
		return strings;
	}




	public void setStrings(List<String> strings) {
		this.strings = strings;
	}




	@Override
	public String toString() {
		return "Prototyp [name=" + name + ", object=" + object + ", strings=" + strings + "]";
	}


}
