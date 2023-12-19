package homework.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Задача 1.
 * Создать коллекцию целых чисел и заполнить ее значениями, введенными с консоли.
 * При заполнении коллекции числами с консоли следует делать приведения типа.
 * Код для приведения строки к числу можно использовать следующий:
 * 	int i = Integer.parseInt(str);
 * 	или
 * 	int val = Integer.valueOf(str);
 * Для окончания ввода введите слово "exit".
 * При приведении строки к числу, следует учитывать возможность исключений.
 */
public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> myArray = new ArrayList<>();
        System.out.println("Enter the number");
        String input = scanner.nextLine();
        int count = 0;
        while (true) {
            if (count == 0) {
                try {
                    int num = Integer.parseInt(input);
                    myArray.add(num);
                    System.out.println("Enter the number");
                    input = scanner.nextLine();
                } catch (NumberFormatException e) {
                    System.out.println("Incorrect input, please enter correctly");
                    input = scanner.nextLine();
                }
                if (input.equals("exit")) {
                    int count1 = 0;
                    System.out.println("Start printing even numbers");
                    for (Integer integer : myArray) {
                        int num = integer % 2;
                        if (num == 0) {
                            System.out.println(integer);
                            count1++;
                        }
                    }
                    if(count1 == 0) {System.out.println("No even elements found");}
                    count++;
                }
            } else {
                System.out.println("End of printing");
                break;
            }
        }
    }
}