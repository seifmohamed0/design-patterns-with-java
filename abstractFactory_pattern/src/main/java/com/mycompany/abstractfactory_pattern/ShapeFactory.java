package com.mycompany.abstractfactory_pattern;

public class ShapeFactory implements AbstractFactory {

    @Override
    public Shape getShape(String ShapeType) {
        if (ShapeType == null) {
            return null;
        }
        if (ShapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (ShapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }

    @Override
    public Color getColor(String ColorType) {
        return null;
    }

}
