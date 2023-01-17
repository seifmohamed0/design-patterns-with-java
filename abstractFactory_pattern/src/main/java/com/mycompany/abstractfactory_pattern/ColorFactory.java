
package com.mycompany.abstractfactory_pattern;


public class ColorFactory implements AbstractFactory {

    @Override
    public Shape getShape(String ShapeType) {
        return null;
    }

    @Override
    public Color getColor(String ColorType) {
        if (ColorType == null) {
            return null;
        }
        if (ColorType.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (ColorType.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        return null;
    }
    
}
