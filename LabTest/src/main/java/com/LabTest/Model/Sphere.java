package com.LabTest.Model;

import com.LabTest.Model.Shape;
import org.springframework.stereotype.Component;


public class Sphere implements Shape {


    public double calArea(double val) {
        // Implement area calculation for sphere
        return 4 * Math.PI * val * val;
    }
}