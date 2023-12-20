package homework.task_2.figures;

public class Circle extends BaseFigures {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double perimeterCalculation() {
        System.out.print("Perimeter circle: ");
        return 2 * 3.14 * radius;
    }
}
