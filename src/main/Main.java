package main;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        Vector2D Wektor1 = new Vector2D(3,0);
        Vector2D Wektor2 = new Vector2D(-1,2);
        Vector2D Wektor3 = new Vector2D(1,-4);

        Vector3DInheritance Wektor3d1 = new Vector3DInheritance(3,2,0);
        Vector3DInheritance Wektor3d2 = new Vector3DInheritance(2,4,0);
        Vector3DInheritance Wektor3d3 = new Vector3DInheritance(2,5,0);


        Polar2DAdapter Werktor_1a = new Polar2DAdapter(Wektor1);
        Polar2DAdapter Werktor_2a = new Polar2DAdapter(Wektor2);
        Polar2DAdapter Werktor_3a = new Polar2DAdapter(Wektor3);

        System.out.println("Moduł Wektor1: " + Wektor1.abs());
        System.out.println("Moduł Wektor2: " + Wektor2.abs());
        System.out.println("Moduł Wektor3: " + Wektor3.abs());

        System.out.println("Iloczyn skalarny Wektor1 i Wektor_2a: " + Wektor1.cdot(Werktor_2a));
        System.out.println("Iloczyn skalarny Wektor2 i Wektor_3a: " + Wektor2.cdot(Werktor_3a));
        System.out.println("Iloczyn skalarny Wektor3 i Wektor_1a: " + Wektor3.cdot(Werktor_1a));

        System.out.println("Wartości składowe Wektora1: " + Wektor1.getComponents()[0] + ", " + Wektor1.getComponents()[1]);
        System.out.println("Wartości składowe Wektora2: " + Wektor2.getComponents()[0] + ", " + Wektor2.getComponents()[1]);
        System.out.println("Wartości składowe Wektora3: " + Wektor3.getComponents()[0] + ", " + Wektor3.getComponents()[1]);


        System.out.println("Iloczyn wektorowy 3D");
        System.out.println("Wektor1 * Wektor2: " + Wektor3d1.cross(Wektor3d2).getComponents()[0]+ ", " +Wektor3d1.cross(Wektor3d2).getComponents()[1]+ ", " +Wektor3d1.cross(Wektor3d2).getComponents()[2]);
        System.out.println("Wektor2 * Wektor1: " + Wektor3d2.cross(Wektor3d1).getComponents()[0]+ ", " +Wektor3d2.cross(Wektor3d1).getComponents()[1]+ ", " +Wektor3d2.cross(Wektor3d1).getComponents()[2]);
        System.out.println("Wektor2 * Wektor3: " + Wektor3d2.cross(Wektor3d3).getComponents()[0]+ ", " +Wektor3d2.cross(Wektor3d3).getComponents()[1]+ ", " +Wektor3d2.cross(Wektor3d3).getComponents()[2]);
        System.out.println("Wektor3 * Wektor2: " + Wektor3d3.cross(Wektor3d2).getComponents()[0]+ ", " +Wektor3d3.cross(Wektor3d2).getComponents()[1]+ ", " +Wektor3d3.cross(Wektor3d2).getComponents()[2]);
        System.out.println("Wektor3 * Wektor1: " + Wektor3d3.cross(Wektor3d1).getComponents()[0]+ ", " +Wektor3d3.cross(Wektor3d1).getComponents()[1]+ ", " +Wektor3d3.cross(Wektor3d1).getComponents()[2]);
        System.out.println("Wektor1 * Wektor3: " + Wektor3d1.cross(Wektor3d3).getComponents()[0]+ ", " +Wektor3d1.cross(Wektor3d3).getComponents()[1]+ ", " +Wektor3d1.cross(Wektor3d3).getComponents()[2]);
    }
}
