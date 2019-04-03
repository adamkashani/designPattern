package creational.abstract_factory;

import creational.abstract_factory.baens.Shape;

//we can use interFace like abstract factory 
public interface FactoryInterFace {

	public Shape getShape(String name);

}
