package com.LabTest.Model;

import org.springframework.stereotype.Component;


public class Circle implements Shape {


    public double calArea(double val) {
        // Implement area calculation for circle
        return Math.PI * val * val;
    }
}