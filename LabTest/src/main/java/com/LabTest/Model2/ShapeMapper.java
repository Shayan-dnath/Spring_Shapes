package com.LabTest.Model2;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ShapeMapper implements RowMapper<Shape> {
    @Override
    public Shape mapRow(ResultSet rs, int rowNum) throws SQLException {
        Shape shape = new Shape();
        shape.setId(rs.getInt("id"));
        shape.setEntity(rs.getString("entity"));
        shape.setArea(rs.getDouble("area"));
        return shape;
    }
}