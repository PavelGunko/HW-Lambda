import java.util.Collections;
import java.util.Comparator;

public class PersonComparator<PersonComparator> implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        String[] subSurname1 = o1.getSurname().split(" ");
        int len1 = subSurname1.length;
        String[] subSurname2 = o2.getSurname().split(" ");
        int len2 = subSurname2.length;
        if (len1 == len2) {
            return o2.getAge() - o1.getAge();

        }

        return len2 - len1;
    }
}

