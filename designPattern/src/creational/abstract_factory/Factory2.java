package creational.abstract_factory;

import creational.abstract_factory.baens.Shape;
import creational.abstract_factory.baens.Square;

public class Factory2 extends AbstractFactory {


	@Override
	public Shape createShape() {
		return new Square();
	}

}
