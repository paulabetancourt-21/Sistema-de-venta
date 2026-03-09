package co.edu.uptc;

import co.edu.uptc.model.withoutFormat.ManagerFileWithoutFormat;
import co.edu.uptc.pojo.Person;
import co.edu.uptc.presenter.Runner;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.start();

        //TODO ESTO SE DEBE DE BORRAR
        ManagerFileWithoutFormat mF = new ManagerFileWithoutFormat();
        Person p = new Person(1, "Paula", "Betancourt", "Femenino", new Date());
        mF.addPerson(p);
    }
}