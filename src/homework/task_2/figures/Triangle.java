package homework.task_2.figures;

public class Triangle extends BaseFigures {
    double length;
    double width;
    double height;

    public Triangle(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    @Override
    public double perimeterCalculation() {
        System.out.print("Perimeter triangle: ");
        return length + width + height;
    }
}
