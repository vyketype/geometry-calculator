package com.gmail.vprototype01.geocalc;

import java.util.*;

public class Main {
    
    public static void main (String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter shape to calculate area.");
        System.out.println("Choose out of: rectangle, circle, ellipse, losange, trapeze, square, triangle, " +
                "parallelogram, regpolygon");

        String option = input.nextLine();

        switch (option) {
            case "rectangle":
                System.out.println("You chose " + option + ". Enter the first side of your rectangle.");
                double sideA = input.nextDouble();
                System.out.println("First side: " + sideA + ". Now the second side.");
                double sideB = input.nextDouble();
                System.out.println("Second side: " + sideB);
                System.out.println("The area of your rectangle is: " + calculator.getRectangleArea(sideA, sideB));
                break;
            case "circle":
                System.out.println("You chose " + option + ". Enter the radius of your circle.");
                double radius = input.nextDouble();
                System.out.println("Radius: " + radius);
                System.out.println("The area of your circle is: " + calculator.getCircleArea(radius));
                break;
            case "ellipse":
                System.out.println("You chose " + option + ". Enter the first axis of your ellipse.");
                double axisA = input.nextDouble();
                System.out.println("First axis: " + axisA + ". Now the second axis.");
                double axisB = input.nextDouble();
                System.out.println("Second axis: " + axisB);
                System.out.println("The area of your rectangle is: " + calculator.getEllipseArea(axisA, axisB));
                break;
            case "losange":
                System.out.println("You chose " + option + ". Enter the first diagonal of your losange.");
                double diagA = input.nextDouble();
                System.out.println("First diagonal: " + diagA + ". Now the second diagonal.");
                double diagB = input.nextDouble();
                System.out.println("Second diagonal: " + diagB);
                System.out.println("The area of your losange is: " + calculator.getLosangeArea(diagA, diagB));
                break;
            case "trapeze":
                System.out.println("You chose " + option + ". Enter the large base of your trapeze.");
                double largeBase = input.nextDouble();
                System.out.println("Large base: " + largeBase + ". Now the small base.");
                double smallBase = input.nextDouble();
                System.out.println("Small base: " + smallBase + ". Now the height.");
                double tHeight = input.nextDouble();
                System.out.println("Height: " + tHeight);
                System.out.println("The area of your trapeze is: " + calculator.getTrapezeArea(
                        largeBase, smallBase, tHeight));
                break;
            case "square":
                System.out.println("You chose " + option + ". Enter one side of your square.");
                double side = input.nextDouble();
                System.out.println("Side: " + side);
                System.out.println("The area of your square is: " + calculator.getSquareArea(side));
                break;
            case "triangle":
                System.out.println("You chose " + option + ". Enter the base of your triangle.");
                double base = input.nextDouble();
                System.out.println("Base: " + base + ". Now the height.");
                double height = input.nextDouble();
                System.out.println("Height: " + height);
                System.out.println("The area of your triangle is: " + calculator.getTriangleArea(base, height));
                break;
            case "parallelogram":
                System.out.println("You chose " + option + ". Enter the base of your parallelogram.");
                double pBase = input.nextDouble();
                System.out.println("Base: " + pBase + ". Now the height.");
                double pHeight = input.nextDouble();
                System.out.println("Height: " + pHeight);
                System.out.println("The area of your parallelogram is: " + calculator.getParallelogramArea(
                        pBase, pHeight));
                break;
            case "regpolygon":
                System.out.println("You chose " + option + ". Enter the number of sides of your polygon");
                int sides = input.nextInt();
                System.out.println("Number of sides: " + sides + ". Now the apothem.");
                double apo = input.nextDouble();
                System.out.println("Apothem: " + apo + ". Now the base.");
                double rBase = input.nextDouble();
                System.out.println("Base: " + rBase);
                System.out.println("The area of your regular polygon of " + sides + " sides is: " +
                        calculator.getRegularPolygonArea(sides, rBase, apo));
                break;
            default:
                System.out.println("Please specify a valid shape.");
                reset();
                return;
        }

        System.out.println("Make sure to round up the long decimals!");
        System.out.println("Note: this message will clear in 20 seconds. Or just type \"reset\" to move on.");

        Thread.sleep(20000);
        reset();

    }

    public static void reset() throws InterruptedException {
        for (int i = 1; i < 20; i++) {
            System.out.println(" ");
        }

        main(null);
    }

}