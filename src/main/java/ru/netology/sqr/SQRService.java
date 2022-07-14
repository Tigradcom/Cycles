package ru.netology.sqr;

public class SQRService {

    public int calcCount(int min, int max) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (min <= i * i & i * i <= max) {
                count++;
            }
        }
        return count;
    }
}
