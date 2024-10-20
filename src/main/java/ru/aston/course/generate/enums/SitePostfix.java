package ru.aston.course.generate.enums;

public enum SitePostfix {
    com,net,ru,org,su;

    public static String getRandomPostfix() {
        Integer i = (int) (Math.random() * 5);
        String postfix = SitePostfix.values()[i].toString();
        return postfix;
    }
}
