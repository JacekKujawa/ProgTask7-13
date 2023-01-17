package com.company;


import java.time.LocalDate;
import java.util.Random;

public class Student {


    public void getExamDate() {
        Random generator = new Random();
        int d = generator.nextInt(31) + 1;
        int m = generator.nextInt(12) + 1;
        LocalDate date = LocalDate.of(LocalDate.now().getYear(), m, d);
        System.out.println(date);

    }

    public void NumberIsEven(int number) {

        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is not even");
        }
    }

    public void NumberIsEvenSwitch(int number) {

        switch (number % 2) {
            case 0:
                System.out.println("Number is even");
            case 1:
                System.out.println("Number is not even");
        }


    }
}