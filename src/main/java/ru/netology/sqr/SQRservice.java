package ru.netology.sqr;

public class SQRservice {
    public int calculate(int min, int max) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min) {
                if (i * i <= max) {
                    counter++;

                }

            }
        }
        return counter;
    }
}
