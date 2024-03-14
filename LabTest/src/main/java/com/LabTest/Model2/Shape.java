package com.LabTest.Model2;

public class Shape {
    private int id;
    private String entity;
    private double area;

    public Shape(int id, String entity, double area) {
        this.id = id;
        this.entity = entity;
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Shape() {
    }

    @Override
    public String toString() {
        return "Shape{" +
                "id=" + id +
                ", entity='" + entity + '\'' +
                ", area=" + area +
                '}';
    }
}
