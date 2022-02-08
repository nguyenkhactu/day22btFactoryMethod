package com.company;

public class ShapeFactory {
    private Shape shape;
    public static Shape getShape(int sc){
        switch (sc){
            case 1:
                return new Circle();

            case 2:
                return new Square();

            case 3:
                return new Rectangle();

        }
        return null;
    }
}
