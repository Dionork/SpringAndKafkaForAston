package ru.aston.course.generate.random;

import ru.aston.course.generate.enums.SitePostfix;

public class SiteRandom {
    String site = "example";

    public String getSite() {
        site = site +"."+ SitePostfix.getRandomPostfix();
        return site;
    }
}
