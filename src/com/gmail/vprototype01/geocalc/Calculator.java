package com.gmail.vprototype01.geocalc;

public class Calculator {

    /* TODO
        also find missing variables in formulas
     */

    public double getSquareArea (double side) {
        return side * side;
    }

    public double getRectangleArea (double base, double height) {
        return base * height;
    }

    public double getLosangeArea (double diagA, double diagB) {
        return (diagA * diagB) / 2;
    }

    public double getTriangleArea (double base, double height) {
        return (base * height) / 2;
    }

    public double getParallelogramArea (double base, double height) {
        return base * height;
    }

    public double getTrapezeArea (double baseA, double baseB, double height) {
        return ((baseA + baseB) * height) / 2;
    }

    public double getRegularPolygonArea (int sides, double base, double apothem) {
        return sides * ((base * apothem) / 2);
    }

    public double getCircleArea (double radius) {
        return Math.PI * (radius * radius);
    }

    public double getEllipseArea (double axisA, double axisB) {
        return Math.PI * axisA * axisB;
    }

}
