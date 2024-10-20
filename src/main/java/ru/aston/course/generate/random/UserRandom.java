package ru.aston.course.generate.random;

public class UserRandom {
    String name = "user";
    public String getName() {
        Integer i = (int) (Math.random() * 100);
        String userName = name + i;
        return userName;
    }
}
