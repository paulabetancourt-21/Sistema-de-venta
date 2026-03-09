package co.edu.uptc.model.withoutFormat;

import co.edu.uptc.model.config.GlobalConfig;
import co.edu.uptc.pojo.Person;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class ManagerFileWithoutFormat {
    public void addPerson(Person person) {
        Path filePath = Paths.get(GlobalConfig.personFileName);
        try {
            String auxPerson = person.getName() +
            person.getLastName() +
            person.getGender() +
            person.getBirthDate();
            Files.writeString(filePath, auxPerson);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Person> loadData(){
        Path filePath = Paths.get(GlobalConfig.personFileName);
        return null;
    }
}