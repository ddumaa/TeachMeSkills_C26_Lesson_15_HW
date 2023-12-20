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

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
