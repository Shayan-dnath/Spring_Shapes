package com.LabTest.Model;

import com.LabTest.Model.Shape;
import org.springframework.stereotype.Component;


public class Triangle implements Shape {


    public double calArea(double val) {
        // Implement area calculation for triangle
        // Assuming val represents the base of the triangle
        return (Math.sqrt(3) / 4) * val * val;
    }
}






