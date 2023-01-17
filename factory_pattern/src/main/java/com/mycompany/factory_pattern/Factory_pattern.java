
package com.mycompany.factory_pattern;

/**
 *
 * @author seif
 */
public class Factory_pattern {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();
    }
}
