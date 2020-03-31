package pl.accenture.szkolka.Komparator;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.List;

import static pl.accenture.szkolka.Komparator.PersonKomp.*;



class KomparatorZad {
    public static void main(String[] args) {
        List.of(
                new PersonKomp("Adam", "Bułka", new Adress("Sezamkowa")),
                new PersonKomp("Katarzyna", "Mała", new Adress("Wiązów")),
                new PersonKomp("John", "Krzyżak", new Adress("VisteriaLane")),
                new PersonKomp("Mała", "Mi", new Adress("Sezamkowa"))

        ).stream()
                .sorted(posortujPoImieniu.thenComparing(posortujPoNazwisku.reversed()))
                .forEach(System.out::println);
    }
}

@Data
@AllArgsConstructor
class PersonKomp {
    private String name;
    private String lastName;
    private Adress address;

//    static Comparator<PersonKomp> posortujPoImieniu = (p1, p2) -> p1.getName().compareTo(p2.getName()); + altEnter:
    static Comparator<PersonKomp> posortujPoImieniu = Comparator.comparing(PersonKomp::getName);
//    static Comparator<PersonKomp> posortujPoNazwisku = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());
    static Comparator<PersonKomp> posortujPoNazwisku = Comparator.comparing(PersonKomp::getLastName);
//    static Comparator<PersonKomp> posortujPoAdresie = (p1, p2) -> p1.getAddress().getStreet().compareTo(p2.getAddress().getStreet());
    static Comparator<PersonKomp> posortujPoAdresie = Comparator.comparing(p -> p.getAddress().getStreet());

}

@Data
@AllArgsConstructor
class Adress{
    private String street;
}
