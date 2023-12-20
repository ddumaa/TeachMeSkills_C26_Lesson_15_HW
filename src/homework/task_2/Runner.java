package homework.task_2;

import homework.task_2.figures.BaseFigures;
import homework.task_2.figures.Circle;
import homework.task_2.figures.Rectangle;
import homework.task_2.figures.Triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать коллекцию фигур.
 * Заполнить коллекцию различными фигурами.
 * Пройти циклом по коллекции и вызвать метод для подсчета и вывода на экран периметра каждой фигуры.
 */
public class Runner {
    public static void main(String[] args) {
        List<BaseFigures> figuresList = new ArrayList<>();
        figuresList.add(new Circle(4.5));
        figuresList.add(new Rectangle(10, 5));
        figuresList.add(new Triangle(6, 4, 7));
        figuresList.add(new Triangle(10, 11, 8));
        figuresList.add(new Circle(8));
        figuresList.add(new Rectangle(4, 2));


        for (BaseFigures bf: figuresList){
            System.out.println(bf.perimeterCalculation());
        }
    }
}
