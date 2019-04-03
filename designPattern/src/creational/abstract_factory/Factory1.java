package creational.abstract_factory;

import creational.abstract_factory.baens.Circle;
import creational.abstract_factory.baens.Shape;

public class Factory1 extends AbstractFactory {

	@Override
	public Shape createShape() {
		return new Circle();
	}

}
