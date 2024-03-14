import com.LabTest.Model.Circle;
import com.LabTest.Model.Sphere;
import com.LabTest.Model.Square;
import com.LabTest.Model.Triangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {

    @Test
    public void testTriangleArea() {
        Triangle triangle = new Triangle();
        assertEquals(6.928203230275509, triangle.calArea(4.0), 0.0001); // Positive test
    }

    @Test
    public void testSquareArea() {
        Square square = new Square();
        assertEquals(16.0, square.calArea(4.0)); // Positive test
    }

    @Test
    public void testCircleArea() {
        Circle circle = new Circle();
        assertEquals(12.566370614359172, circle.calArea(2.0), 0.0001); // Positive test
    }

    @Test
    public void testSphereArea() {
        Sphere sphere = new Sphere();
        assertEquals(50.26548245743669, sphere.calArea(2.0), 0.0001); // Positive test
    }

    @Test
    public void testTriangleNegativeInput() {
        Triangle triangle = new Triangle();
        assertThrows(IllegalArgumentException.class, () -> {
            triangle.calArea(-4.0); // Negative test with negative input
        });
    }

    @Test
    public void testSquareNegativeInput() {
        Square square = new Square();
        assertThrows(IllegalArgumentException.class, () -> {
            square.calArea(-4.0); // Negative test with negative input
        });
    }

    @Test
    public void testCircleNegativeInput() {
        Circle circle = new Circle();
        assertThrows(IllegalArgumentException.class, () -> {
            circle.calArea(-2.0); // Negative test with negative input
        });
    }

    @Test
    public void testSphereNegativeInput() {
        Sphere sphere = new Sphere();
        assertThrows(IllegalArgumentException.class, () -> {
            sphere.calArea(-2.0); // Negative test with negative input
        });
    }
}
