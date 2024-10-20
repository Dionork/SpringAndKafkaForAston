package ru.aston.course.generate;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.aston.course.generate.model.ModelForFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileGenerator {
    public static void fileGenerate() {
        String path = "src/main/resources/templates/data.txt";
        try {
            ObjectMapper mapper = new ObjectMapper();
            File file = new File(path);
            if (file.exists()) {
                file.delete();
                System.out.println("Файл удален!");
            }
            List<ModelForFile> list = new ArrayList<>();
            for (int i = 0; i < 10000; i++) {
                ModelForFile model = ModelForFile.getRandom();
                list.add(model);
            }
            mapper.writeValue(file, list);
            System.out.println("Файл создан!");
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
