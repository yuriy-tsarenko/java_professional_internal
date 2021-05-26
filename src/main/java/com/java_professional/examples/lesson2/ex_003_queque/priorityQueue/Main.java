package com.java_professional.examples.lesson2.ex_003_queque.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Создаем объект класс PriorityQueue, начальная емкость - 2, а также создаем анонимный внутренний класс
        Queue<Integer> queue = new PriorityQueue<>(2, new Comparator<Integer>() {
            @Override
            // Реализуем обратный метод сортировки при помощи метода compare
            public int compare(Integer i1, Integer i2) {
                return i1 - i2;
            }
        });
        // Вставляем элемент в очередь
        queue.offer(7); // change 7
        queue.offer(9); // change 9
        System.out.println(queue);
        queue.offer(1); // change 10
        queue.offer(6); // change 11
        System.out.println(queue);
        // Методом poll возвращаем и удаляем головной элемент очереди
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(3);
        priorityQueue.offer(1);
        priorityQueue.offer(7);
        priorityQueue.offer(4);
        priorityQueue.add(10);
        priorityQueue.add(9);
        Integer element = priorityQueue.element();

    }
}
