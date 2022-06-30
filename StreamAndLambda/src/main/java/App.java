import org.ning.entiry.Person;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Author:
 * Created at:2022/7/1
 * Updated at:
 **/



public class App {
    public static void main(String[] args) {
        List<Person> personList= Person.createRoster();
        List<Person> personList1 = personList.stream().filter(person -> person.getTall() > 180).collect(Collectors.toList());
        System.out.println(personList1);
    }
}
