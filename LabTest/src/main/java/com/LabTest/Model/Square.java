package com.LabTest.Model;

import com.LabTest.Model.Shape;
import org.springframework.stereotype.Component;

public class Square implements Shape {


    public double calArea(double val) {
        // Implement area calculation for square
        return val * val;
    }
}