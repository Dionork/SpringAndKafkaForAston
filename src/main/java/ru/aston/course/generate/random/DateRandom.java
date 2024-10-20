package ru.aston.course.generate.random;

public class DateRandom {
    String date = "2024-10";
    public String getDate(){
        Integer i = (int)(Math.random()* 30 + 1);
        if (i < 10){
          return date = date + "-0" + i;
        }
        return date + "-" + i;
    }
}
