package com.LabTest.DAO;

import com.LabTest.Model2.Shape;
import com.LabTest.Model2.ShapeMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;
@Component
public class ShapeDAOImpl implements ShapeDAO {

    private JdbcTemplate jdbcTemplate;

    public ShapeDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void saveShape(Shape shape) {
        String sql = "INSERT INTO Shape (entity, area) VALUES (?, ?)";
        jdbcTemplate.update(sql, shape.getEntity(), shape.getArea());
    }

    @Override
    public List<Shape> getAllShapes() {
        String sql = "SELECT * FROM Shape";
        return jdbcTemplate.query(sql, new ShapeMapper());
    }
}