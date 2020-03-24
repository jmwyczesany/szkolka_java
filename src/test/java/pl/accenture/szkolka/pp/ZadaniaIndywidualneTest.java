package pl.accenture.szkolka.pp;

import io.github.netmikey.logunit.api.LogCapturer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.junit.jupiter.api.Assertions.*;

class ZadaniaIndywidualneTest {

    @RegisterExtension
    LogCapturer log = LogCapturer.create().captureForType(ZadaniaIndywidualne.class);

    // done 3 utwórz testy dla metod z punktu 2
    @Test
    void getInteger() {
        // given
        // when
        int returnedValue = ZadaniaIndywidualne.getInteger();
        // then
        assertEquals(returnedValue, ZadaniaIndywidualne.getInteger());
    }

    @Test
    void getaByte() {
        // given
        // when
        byte returnedValue = ZadaniaIndywidualne.getaByte();
        // then
        assertEquals(returnedValue, ZadaniaIndywidualne.getaByte());
    }

    @Test
    void getaShort() {
        //given
        //when
        short returnedValue = ZadaniaIndywidualne.getaShort();
        //then
        assertEquals(returnedValue, ZadaniaIndywidualne.getaShort());

    }

    @Test
    void getaLong() {
        //given
        //when
        long returnedValue = ZadaniaIndywidualne.getaLong();
        //then
        assertEquals(returnedValue, ZadaniaIndywidualne.getaLong());
    }

    @Test
    void getaDouble() {
        //given
        //when
        double returnedValue = ZadaniaIndywidualne.getaDouble();
        //then
        assertEquals(returnedValue, ZadaniaIndywidualne.getaDouble());
    }

    @Test
    void getaFloat() {
        //given
        //when
        float returnedValue = ZadaniaIndywidualne.getaFloat();
        //then
        assertEquals(returnedValue, ZadaniaIndywidualne.getaFloat());
    }

    @Test
    void getHello() {
        //given
        //when
        String returnedValue = ZadaniaIndywidualne.getHello();
        //then
        assertEquals(returnedValue, ZadaniaIndywidualne.getHello());
    }

    @Test
    void isBool() {
        //given
        //when
        boolean returnedValue = ZadaniaIndywidualne.isBool();
        //then
        assertEquals(returnedValue, ZadaniaIndywidualne.isBool());
    }

    @Test
    void getaChar() {
        //given
        //when
        char returnedValue = ZadaniaIndywidualne.getaChar();
        //then
        assertEquals(returnedValue, ZadaniaIndywidualne.getaChar());
    }
    /*
            done 7 utwórz testy dla metod z punktów 4-6 dla testowania logowanych wartości, użyj

     */
    @Test
    void logHello(){
        //given
        //when
        ZadaniaIndywidualne.logHello();
        //then
        log.assertContains("Hello");
    }

    @Test
    void logHelloWithArgument(){
        //given
        String argument = "hello";
        //when
        ZadaniaIndywidualne.logHelloWithArgument(argument);
        //then
        log.assertContains("Hello, hello!");
    }

    @Test
    void getHelloWithArgument(){
        //given
        String argument = "hello";
        //when
        ZadaniaIndywidualne.getHelloWithArgument(argument);
        //then
        log.assertContains("Hello, hello!");
    }
}