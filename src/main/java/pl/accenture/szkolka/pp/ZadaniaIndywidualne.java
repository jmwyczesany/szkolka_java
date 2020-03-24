package pl.accenture.szkolka.pp;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ZadaniaIndywidualne {

    // done 1 zadeklaruj zmienne z typami prostymi występującymi z Javie
    public static int integer = 10;
    public static byte aByte = 10;
    public static short aShort = 10;
    public static long aLong = 10L;
    public static double aDouble = 10.0D;
    public static float aFloat = 10.0F;
    public static String hello = "Hello";
    public static boolean bool = true;
    public static char aChar = 'f';


    private static final Logger LOG1 = Logger.getLogger("pl.accenture.szkolka.pp.ZadaniaIndywidualne");

    // done 4 utwórz metodę void wypisującą do loggera "Hello"
    public static void logHello() {
        LOG1.log(Level.INFO, "Hello");
    }

    // done 5 utwórz metodę void wypisującą do loggera "Hello " + przekazany do metody argument
    public static void logHelloWithArgument(String argument) {
        LOG1.log(Level.INFO, String.format("Hello, %s!%n", argument));
    }

    // done utwórz metodę zwracającą  "Hello " + przekazany do metody argument
    public static String getHelloWithArgument(String argument) {
        return String.format("Hello, %s!%n", argument);
    }


    // done 2 zadeklaruj metody zwracające te zmienne

    public static int getInteger() {
        return integer;
    }

    public static byte getaByte() {
        return aByte;
    }

    public static short getaShort() {
        return aShort;
    }

    public static long getaLong() {
        return aLong;
    }

    public static double getaDouble() {
        return aDouble;
    }

    public static float getaFloat() {
        return aFloat;
    }

    public static String getHello() {
        return hello;
    }

    public static boolean isBool() {
        return bool;
    }

    public static char getaChar() {
        return aChar;
    }

}
