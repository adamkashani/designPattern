package creational.abstract_factory;

import creational.abstract_factory.baens.Shape;

public abstract class AbstractFactory {
	
	public abstract Shape createShape();
	
	
	public static AbstractFactory getfactory (String name) {
		
		switch (name) {
		case "factory1":
			return new Factory1();
		case "factory2":
			return new Factory2();

		default:
			return null;
		}
		
	}

}
