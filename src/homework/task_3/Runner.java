package homework.task_3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Создать коллекцию целых чисел.
 * Заполните коллекцию рандомными числами.
 * Пусть размер коллекции задается с консоли.
 * Предусмотреть возможно ошибок при получении размера коллекции с консоли.
 * Предусмотреть проверку введенного размера коллекции на валидность.
 * Посчитайте и выведите на экран среднее арифметическое все элементов коллекции.
 */
public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myList = new ArrayList<>();
        int number = 5;
        int sum = 0;
        try{
            number = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("incorrect size input, default size is set to - 5");
        }
        while (true){
            if(number <= 0) {
                System.out.println("incorrect size input, default size is set to - 5");
                number = 5;
            } else {
                for (int i = 0; i < number; i++) {
                    int a = (int) (Math.random() * 100);
                    myList.add(i, a);
                    sum += myList.get(i);
                }
                System.out.println("Arithmetic mean of the List \"myList\": " + sum / number);
                break;
            }
        }
    }
}
