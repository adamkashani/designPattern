package creational.abstract_factory;

import creational.abstract_factory.baens.Shape;

public class Main {

	public static void main(String[] args) {

		Shape shape = AbstractFactory.getfactory("factory1").createShape();


		System.out.println(shape.getType());
	}






}
