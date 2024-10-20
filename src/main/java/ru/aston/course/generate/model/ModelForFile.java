package ru.aston.course.generate.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import ru.aston.course.generate.random.DateRandom;
import ru.aston.course.generate.random.SiteRandom;
import ru.aston.course.generate.random.UserRandom;

@Getter
@Setter
public class ModelForFile {
    String site;
    String date;
    String user;
    @Autowired
    public ModelForFile(SiteRandom site, DateRandom date, UserRandom user) {
        this.site = site.getSite();
        this.date = date.getDate();
        this.user = user.getName();
    }
    public static ModelForFile getRandom() {
        return new ModelForFile(new SiteRandom(), new DateRandom(), new UserRandom());
    }

}
