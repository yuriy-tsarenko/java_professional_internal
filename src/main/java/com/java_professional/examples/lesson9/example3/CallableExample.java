package com.java_professional.examples.lesson9.example3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
    public CallableExample() {
        // Определяем пул из трех потоков
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Список ассоциированных с Callable задач Future
        List<Future<String>> futures = new ArrayList<>();

        // Создание экземпляра Callable класса
        Callable<String> callable = new CallableClass();

        for (int i = 0; i < 3; i++) {
            /*
             * Стартуем возвращаюший результат исполнения
             * в виде объекта Future поток
             */
            Future<String> future = executor.submit(callable);
            /*
             * Добавляем объект Future в список для
             * отображения результат выполнения (получение
             * наименования потока)
             */
            futures.add(future);
        }
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss  ");
        for (Future<String> future : futures) {
            try {
                // Выводим в консоль полученное значение
                String text = sdf.format(new Date()) + future.get();
                System.out.println(text);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        // Останавливаем пул потоков
        executor.shutdown();
    }
}
