package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(1, 27.03));
        System.out.println(convertEurToUsd(5, 27.03));

    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        //напишите тут ваш код

        return eur*exchangeRate;

    }
}
