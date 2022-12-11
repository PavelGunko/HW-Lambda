import java.util.*;

public class Main {

    public static void main(String[] args) {

        TreeSet<Person> Persons = new TreeSet<>((o2, o1) -> {

            if (o1.getSurname().split(" ").length == o2.getSurname().split(" ").length) {

                return o1.getAge() - o2.getAge();

            }

            return o1.getSurname().split(" ").length - o2.getSurname().split(" ").length;

        });



        Persons.add(new Person("Gaius", "Iulius Caesar Augustus Germanicus Caligula ", 45));
        Persons.add(new Person("Claudius", "Ptolemy", 30));
        Persons.add(new Person("Julius", "Gaius Caesar ", 50));
        Persons.add(new Person("Lucius", "Lucius Domitius Ahenobarbus Nero", 16));
        Persons.add(new Person("Marcus", "Aurelius Antoninus", 17));



            System.out.println(Persons);
        }


}