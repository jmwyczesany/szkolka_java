package pl.accenture.szkolka.lambda;



class Lambda {
    public static void main(String[] args) {
        MyInterface imp1 = new Klasycznaimplementacja();

        // tak naprawdę nie tworzymy obiektu (bo to nie klasa)
        // klasa anonimowa - bo nie nadaliśmy jej żadnej konktretnej nazwy
        // kluczowe: new MyInterface() -> w locie towrzymy anonimową implementację interfejsu
//        MyInterface impl2 = new MyInterface() {
//            public String go(String name) {
//                return name.toUpperCase();
//            }
//        }; altEnter i mamy lambdę z tego co na górze
        MyInterface impl2 = name -> name.toUpperCase();
        System.out.println(imp1);
        System.out.println(impl2);

        // TODO: 31.03.2020 1c anonimowa implementacja + lambda
        InterfaceWithVoidMethod anonimowaImplementacja1 = new InterfaceWithVoidMethod() {
            @Override
            public void go() {
                System.out.println("Anonimowa implementacja");
            }
        };

        InterfaceWithVoidMethod lambda1 = () -> System.out.println("lambda1");
        lambda1.go();

        // TODO: 31.03.2020 1c anonimowa implementacja + lambda
        InterfaceWithStingMethod anonimowaimplementacja2 = new InterfaceWithStingMethod() {
            @Override
            public String go() {
                return "go";
            }
        };

        InterfaceWithStingMethod lambda2 = () -> "go";
        System.out.println(lambda2.go());

        // TODO: 31.03.2020 1c anonimowa implementacja + lambda
        InterfaceWithStringMethodAndArgument anonimowaImplementacja3 = new InterfaceWithStringMethodAndArgument() {
            @Override
            public String go(String name) {
                return name.toUpperCase();
            }
        };

        InterfaceWithStringMethodAndArgument anonimowaImplementacja4 = name -> name.toUpperCase();
        System.out.println(anonimowaImplementacja4.go("dżadwiga"));

    }
}
/*
przykład z zajęć - interfejs funkcyjny (opatrzony lub nie odpowiednią adnotacją)
 */
interface MyInterface {
    String go(String name);
//    String go();

}

// TODO: 31.03.2020 1a tworzymy interfejs funkcyjny void go()
@FunctionalInterface
interface InterfaceWithVoidMethod {
    void go();
}

// TODO: 31.03.2020 2a tworzymy interfejs funkcyjny String go()
interface InterfaceWithStingMethod{
        String go();
}

// TODO: 31.03.2020 3a tworzymy interfejs funkcyjny String go()
interface InterfaceWithStringMethodAndArgument
{
    String go(String name);
}

//klasyczna implementacja - przykład z zajęć
class Klasycznaimplementacja implements MyInterface {
    public String go(String name) {
        return null;
    }
}


// TODO: 31.03.2020 1b klasyczna implementacja
class KlasycznaimplementacjaWithVoidMethod implements InterfaceWithVoidMethod {

    @Override
    public void go() {
        System.out.println("Klasyczna Implementacja 1");
    }
}

// TODO: 31.03.2020 2b klasyczna implementacja
class KlasycznaImplementacjaWithStringMethod implements InterfaceWithStingMethod {

    @Override
    public String go() {
        return "go";
    }
}
// TODO: 31.03.2020 3b klasyczna implementacja
class KlasycznaImplementacjaWithStringMethodAndArgument implements InterfaceWithStringMethodAndArgument{
    @Override
    public String go(String name) {
        return name.toUpperCase();
    }
}


