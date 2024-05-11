package ru.netology.services.Otdyx1.services;

public class СalcVacService {

    public int calculate(int income, int expenses) {
        int threshold = 0;
        for (int month = 1; month <= 12; month++)
            if (threshold < 20000) {
                threshold = threshold + income - expenses;
                System.out.println("Месяц " + month +  " Денег " + threshold + " Надо работать");
            } else {
                int a = threshold - expenses;
                threshold = a/3;
                System.out.println("Буду отдыхать");
            }
        return threshold;
    }
}
