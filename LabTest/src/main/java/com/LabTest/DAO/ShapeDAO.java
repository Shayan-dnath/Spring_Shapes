package com.LabTest.DAO;

import com.LabTest.Model2.Shape;

import java.util.List;

public interface ShapeDAO {
    void saveShape(Shape shape);
    List<Shape> getAllShapes();
}