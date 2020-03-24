# Szkółka Accenture - moduł PP, krok  1:  zmienne | metody | JUnit

# I Zagadnienia:

# Live coding
##I Szkielet projektu w zdalnym repo
    
    
    Github - utworzenie pustego repozytorium
    
    Wygenerowanie projektu maven, java 11 
    <mvn - struktura projektu, gradle jako opcja>
    
    pl.accenture.szkolka.Main#psvm
    <uruchomienie pustej metody main, omówienie, przekazanie -verbose do JVM)
    
    'Podpięcie Git do repo'
    README.md i .gitignore
    Push (add-commit-push )
    
    <omówienie podstwowego GIT  flow>
    
##II Gałąź GIT procedural_programming, z przetestowaną metodą public static void hello(String name)

	Implementacja - metoda przy użyciu logggera (java.util) loguje "Hello, <name>!".
    
    Utwórz branch procedural_programming
    
    Dodaj pakiet "pp"
    
    Utwórz klasę Krok1
            W javadoc klasy wpisz: zmienne | metody | JUnit
            
    W klasie utwórz metodę public static void hello(String name) logującą "Hello, <name>!"
            Zadeklaruj logger w klasie 
            Użyj logger w metodzie
            
    Test    
            wygeneruj test z klasy (zależności w maven)
            skonfiguruj logunit dla loggera java.util (zależności w pom.xml), rozszerzenie do JUnit
            napisz test do metody
            
     Push do repo
     
     <pokazanie / omówienie live template w IntelliJ>
     <instalacja pluginu codota - kto chce loguje się, kto nie użuwa wyszukiwarki online>

# II Zadania indywidualne:

    Skopiuj poniższe TODO'sy do pliku Java:

    // TODO 1 zadeklaruj zmienne z typami prostymi występującymi z Javie

    // TODO 2 zadeklaruj metody zwracające te zmienne

    // TODO 3 utwórz testy dla metod z punktu 2

    // TODO 4 utwórz metodę void wypisującą do loggera "Hello"

    // TODO 5 utwórz metodę void wypisującą do loggera "Hello " + przekazany do metody argument

    // TODO 6 utwórz metodę zwracającą  "Hello " + przekazany do metody argument

    /*
            TODO 7 utwórz testy dla metod z punktów 4-6 dla testowania logowanych wartości, użyj
            https://github.com/netmikey/logunit
     */
     
# III Zadania grupowe:

##Prezentacje / fiszki / linki
	Przygotowanie materiałów w grupach
	Krótka prezentacja (wybrany temat ze słowniczka) 

###Słowniczek  
        typy proste w Javie
        zmienna, stała, var
        metoda
        parametr vs argument
        vararg
        void
        klasa
        nazwa klasy - skrócona vs pełna
        static
        // vs /* vs /**
        konwencje nazwewnicze - klasa, metoda, zmienna, stała
        main

###Umiejętności:
####Idea
		
    	generowanie projektu maven
 				przekazanie argumentów do JVM
 				logowanie ładowania klas, podczas uruchomienia programu
       tworzenie live template
       instalacja pluginu
       integracja z git
        
####Idea - skróty klawiszowe
 
        tworzenie kodu
                klasa / interfejs
                test z klasy
                dodanie zależności do pom.xml
        refactor:
                zmiana nazwy (klasy, metody, zmiennej)
                refaktor metody z kodu
        nawigacja:
                przejście do deklaracji metody
                wywołania deklarowanej metody
                poprzednio odwiedzane miejsca w kodzie (<- ->)
        misc
                uruchomienie programu
                usunięcie zbędnych importów
                reformat kodu       
####Java        
        deklaracja stałej, zmiennej
        deklaracja metody:
                argumentowa, bezargumentowa, vararg
                void, zwracająca typ
        inicjalizacja / deklaracja zmiennej
                użycie Loggera (java)
                wygenerowania testu z klasy 

        
        kompilacja i uruchomienie prostego programu z konsoli
        ustawienia systemu
                JAVA_HOME
                PATH
                
####Maven
		Ustawienie wersji javy
		Dodanie zależności   
####Git
		Integracja idei z git
		Merge + squash -> push
		Octopus
		
		revert commit
		reset hard
		rebase interactive
		cherry-pick		   

####Miękkie
		Organizacja pracy w grupie
		Przygotowanie prezentacji          

     
                
    
    
    
        
    
    
    
    
    
    