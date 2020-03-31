package pl.accenture.szkolka.lambda;

import lombok.Data;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static pl.accenture.szkolka.lambda.PersonZZadania.*;

class PredykatZadanieIndywidualne {

    public static void main(String[] args) {

        // done: 31.03.2020 3 - kolekcja List<Person> (powyżej 5 elementów)

        List<PersonZZadania> people = List.of(
                new PersonZZadania("Anna", "Biala", 45),
                new PersonZZadania("Maria", "Maria", 15),
                new PersonZZadania("Adam", "Ewa", 20),
                new PersonZZadania("Celyna", "Barbarzynska", 18),
                new PersonZZadania("Karol", "Ksiaze", 21),
                new PersonZZadania("Amadeusz", "Bozart", 101),
                new PersonZZadania("Mateusz", "Apostoł", 2048)
        );
        /*    done: 31.03.2020 4 - stream API
        - odfiltruj używając trzech predykatów
        - wypisz do konsoli odfiltrowane elementy
 */

        List<PersonZZadania> collect = people.stream()
                .filter(nameStartsWithAPredicate.and(lastNameStartsWithBPredicate.and(ageUnder20Predicate).
                        and(p -> p.lastName.length() > 5)).negate())
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}

// done: 31.03.2020 1 - klasa person: name, lastName, age

class PersonZZadania {
    String name;
    String lastName;
    int age;

    public PersonZZadania(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    // done: 31.03.2020 2 - predykaty w klasie imieNaA, nazwizkoNaB, wiekPowyzej20Lat
    static Predicate<PersonZZadania> nameStartsWithAPredicate = person -> person.name.startsWith("A");
    static Predicate<PersonZZadania> lastNameStartsWithBPredicate = person -> person.lastName.startsWith("B");
    static Predicate<PersonZZadania> ageUnder20Predicate = person -> person.age > 20;

    @Override
    public String toString() {
        return "PersonZZadania{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
