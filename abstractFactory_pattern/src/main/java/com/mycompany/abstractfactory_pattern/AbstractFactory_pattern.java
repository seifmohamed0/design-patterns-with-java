package com.mycompany.abstractfactory_pattern;

public class AbstractFactory_pattern {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color color1 = colorFactory.getColor("red");
        color1.fill();

        Color color2 = colorFactory.getColor("green");
        color2.fill();
    }
}
