package pl.accenture.szkolka.pp;

import io.github.netmikey.logunit.api.LogCapturer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class Krok1Test {

    @RegisterExtension
    LogCapturer logs = LogCapturer.create().captureForType(Krok1.class);
    @Test
    // wyświetla komunikat po odpaleniu testu, opis co się powinno wydarzyć, albo coś w ten deseń zależnie od konwencjilogs
    @DisplayName("Jadwinia -> Hello, Jadwinia!")
    void hello() {
//        dobra praktyka - nie zostawiać pustych testów (bo przejdą i dadzą info, że przeszły - a nie dadzą żadnej informacji
//        co się dzieje z kodem -> traktować jak todosa
//        given
//        var - typ wnioskowany na podstawie przypisania. W momencie kompilacji już znamy typ. Używany w zmiennych lokalnych i
//        gdzieś tam jeszcze - ale bardzo trzeba z nim ostrożnie
        var name = "Jadwinia";
//        when
        Krok1.hello(name);
//        then
        logs.assertContains("Hello, Jadwinia!");

    }
}