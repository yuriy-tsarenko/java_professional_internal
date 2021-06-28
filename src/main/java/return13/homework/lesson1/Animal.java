package return13.homework.lesson1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//Задание 2
//Вывод на экран элементов List:
// Создать список, заполнить его на 10 элементов и вывести на экран содержимое используя iterator

public class Animal {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Зубр");
        list.add("Жираф");
        list.add("Слон");
        list.add("Лев");
        list.add("Осел");
        list.add("Тигр");
        list.add("Обезьяна");
        list.add("Суслик");
        list.add("Волк");
        list.add("Ленивец");
        System.out.println(list);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String temp = iterator.next();
            System.out.println(temp);
        }
    }

}
