package com.igordudek;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(10,20);
        PointController pc = new PointController();

        System.out.println("Punkt: ( " + p1.getX() + ";" + p1.getY() + ")");
        System.out.println("dodaj x");
        pc.addX(p1);
        System.out.println("Punkt: ( " + p1.getX() + ";" + p1.getY() + ")");
        System.out.println("odejmij x");
        pc.minuxX(p1);
        System.out.println("Punkt: ( " + p1.getX() + ";" + p1.getY() + ")");
        System.out.println("dodaj y");
        pc.addY(p1);
        System.out.println("Punkt: ( " + p1.getX() + ";" + p1.getY() + ")");
        System.out.println("odejmij y");
        pc.minusY(p1);
        System.out.println("Punkt: ( " + p1.getX() + ";" + p1.getY() + ")");
    }

}
