package pl.accenture.szkolka.Komparator;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.List;

import static pl.accenture.szkolka.Komparator.Person.sortByAttitude;
import static pl.accenture.szkolka.Komparator.Person.sortByName;


public class KomparatorZadIndywid {
    public static void main(String[] args) {
        /*
 done: 31.03.202o 3 wypisać posortowane
 a) pierwszy
 b) oba
 c) oba, jeden z nich odwrócony
 */
        List<Person> people = List.of(
                new Person("Anna", "Maria", new Attitude("Zolza")),
                new Person("Marian", "Zpragi", new Attitude("Cwaniaczek")),
                new Person("Jaromir", "Dmuchawica", new Attitude("Upierdliwiec")),
                new Person("Kaszka", "Manna", new Attitude("Obiad")),
                new Person("Karyna", "Bombel", new Attitude("Karyna")),
                new Person("Seba", "Bombel", new Attitude("Seba"))
        );
//        a) pierwszy
        people.stream()
                .sorted(sortByAttitude)
                .forEach(System.out::println);
//        b) oba
        people.stream()
                .sorted(sortByName.thenComparing(sortByAttitude))
                .forEach(System.out::println);

//        c) oba, jeden z nich odwrócony
        people.stream()
                .sorted(sortByName.thenComparing(sortByAttitude.reversed()))
                .forEach(System.out::println);

    }
}

@Data
@AllArgsConstructor

// done: 31.03.2020 1 Person name, last name, opcjonalnie pole obiektowe
class Person {
    private String name;
    private String lastName;
    private Attitude attitude;

    // done: 31.03.202o 2 2 komparatory

    static Comparator<Person> sortByName = Comparator.comparing(p -> p.name);
    static Comparator<Person> sortByAttitude = Comparator.comparing(p -> p.getAttitude().getTemper());

}

@Data
@AllArgsConstructor
class Attitude {
    private String temper;

}


