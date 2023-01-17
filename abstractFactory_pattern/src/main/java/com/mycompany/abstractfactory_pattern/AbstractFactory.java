
package com.mycompany.abstractfactory_pattern;

public interface AbstractFactory {
    Shape getShape(String ShapeType);
    Color getColor(String ColorType);
}
