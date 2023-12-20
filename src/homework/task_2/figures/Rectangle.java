package homework.task_2.figures;

public class Rectangle extends BaseFigures {
    double length;
    double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double perimeterCalculation() {
        System.out.print("Perimeter rectangle: ");
        return (length + width) * 2;
    }
}
