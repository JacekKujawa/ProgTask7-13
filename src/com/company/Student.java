package com.company;


import java.time.LocalDate;
import java.util.Random;

public class Student {


    public  void getExamDate(){
        Random generator = new Random();
        int  d = generator.nextInt(31) + 1;
        int  m = generator.nextInt(12) + 1;
        LocalDate date = LocalDate.of(LocalDate.now().getYear(), m, d);
        System.out.println(date);

    }


}
