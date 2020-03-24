package pl.accenture.szkolka.pp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *  zmienne | metody | JUnit
 */
public class Krok1 {

    // static final - stała - może być tylko raz zainicjowana i przypisana, jeśli obiekt -
    // można zmienić pola w obiekcie, ale nie można przypisać innego obiaktu. Taka zmienna musi być zainicjalizowan od razu.

    private static final Logger LOG = Logger.getLogger("pl.accenture.szkolka.pp.Krok1");
    public static void hello(String name){
        LOG.log(Level.INFO, String.format("Hello, %s!%n", name));
    }
}
