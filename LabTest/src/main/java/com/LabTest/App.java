package com.LabTest;

import com.LabTest.DAO.ShapeDAO;
import com.LabTest.DbConfig.DbConfig;
import com.LabTest.Model.Circle;
import com.LabTest.Model.Sphere;
import com.LabTest.Model.Square;
import com.LabTest.Model.Triangle;
import com.LabTest.Model2.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DbConfig.class);

        ShapeDAO shapeDAO = context.getBean(ShapeDAO.class);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter Your Choice to Calculate area:\n1.Circle\n2.Sphere\n3.Triangle\n4.Square\n5.Display All\n6.Exit");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Enter the Radius of the Circle");
                    double radius = sc.nextDouble();
                    Circle circle=new Circle();
                    double area = circle.calArea(radius);
                    System.out.println("Area of Circle: "+area);
                    Shape shape = new Shape();
                    shape.setEntity("Circle");
                    shape.setArea(area);
                    shapeDAO.saveShape(shape);
                    break;
                case 2:
                    System.out.println("Enter the Radius of the Sphere");
                    double radius1 = sc.nextDouble();
                    Sphere sphere=new Sphere();
                    double area1 = sphere.calArea(radius1);
                    System.out.println("Area of Spehere: "+area1);
                    Shape shape1 = new Shape();
                    shape1.setEntity("Sphere");
                    shape1.setArea(area1);
                    shapeDAO.saveShape(shape1);
                    break;
                case 3:
                    System.out.println("Enter the base of the Triangle");
                    double base = sc.nextDouble();
                    Triangle triangle=new Triangle();
                    double area2 = triangle.calArea(base);
                    System.out.println("Area of Triangle: "+area2);
                    Shape shape2 = new Shape();
                    shape2.setEntity("Triangle");
                    shape2.setArea(area2);
                    shapeDAO.saveShape(shape2);
                    break;
                case 4:
                    System.out.println("Enter the Side of the Square");
                    double side = sc.nextDouble();
                    Square square=new Square();
                    double area3 = square.calArea(side);
                    System.out.println("Area of Square: "+area3);
                    Shape shape3 = new Shape();
                    shape3.setEntity("Square");
                    shape3.setArea(area3);
                    shapeDAO.saveShape(shape3);
                    break;
                case 5:
                    System.out.println("Displaying all data");
                    List<Shape> shapes = shapeDAO.getAllShapes();
                    for (Shape s : shapes) {
                        System.out.println("ID: " + s.getId() + ", Entity: " + s.getEntity() + ", Area: " + s.getArea());
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Please Enter correct Input");

            }
        }
        }
    }
