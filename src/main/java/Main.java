import classes.Filter;
import classes.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner in = new Scanner(System.in);

        logger.log("Запуск программы");

        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка:");

        int size = in.nextInt();
        System.out.println("Введите верхнюю границу для значений:");
        int max = in.nextInt();

        //Заполняем список случайнми числами
        logger.log("Создаём и наполняем список");
        List<Integer> source = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            source.add(random.nextInt(max));
        }

        System.out.println("Вот случайный список:" + source);

        logger.log("Просим пользователя ввести входные данные для фильтрации");

        System.out.println("Введите порог для фильтра:");
        int inputFilter = in.nextInt();
        Filter filter = new Filter(inputFilter);
        List<Integer> result = filter.filterOut(source);

        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список" + result);
        logger.log("Завершаем программу");
    }
}
