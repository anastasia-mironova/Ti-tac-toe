package com.company;

import java.util.*;
import java.util.Random;

public class BotLogic {

    //Random rand = new Random();

    //final int max = 8;
    //final int rnd = rnd(max);

    /**
     * Метод получения случайного целого числа от 0 до max (включая max);
     */

    static int[][] canvas = {{0,0,0},{0,0,0},{0,0,0}};

    // Ход компьютера (random-бот)
    public static void BotMove() {
        int x = (int) (Math.random() * 3), y = (int) (Math.random() * 3);
        while (canvas[x][y] == 2 || canvas[x][y] == 1) {
            x = (int) (Math.random() * 3);
            y = (int) (Math.random() * 3);
        }
        canvas[x][y] = 2;
    }

    /**
     * Метод, определяющий наличие свободных клеток для хода
     */
    public static boolean CanMove() {
        boolean p = false; /** задаем переменную-ключ - если есть свободная клетка (*) -- принимает значение "истина"
         иначе -- по-умолчанию -- ложь */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (canvas[i][j] == 0) {
                    p = true;
                    break;
                }
            }
            if (p = true) {
                break;
            }
        }
        return p;
    }

    /* // Вывод игрового поля на экран
    public static void PrintCanvas() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(canvas[i][j]);
            }
            System.out.println();
        }
    }*/

    /* public static int rnd(int max) {
        return (int) (Math.random() * ++max);
    }

     for (int i = 0; i < canvas.lenght; i++) {
        for (int j = 0; j < canvas.length; j++) {
            if (canvas[rnd][rnd] == "*") {
                canvas[rnd] = "X";
            } else if (canvas[rnd] == "X") {

            }
        }
    } */
}
