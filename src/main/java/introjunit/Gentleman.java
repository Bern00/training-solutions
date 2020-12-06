package introjunit;

public class Gentleman {

    public String sayHello(String name) {

        String koszontes = "Hello";
        String kiirtsSzoveg;

        if(name == null) {
            kiirtsSzoveg = koszontes + " Anonymous";
        } else kiirtsSzoveg = koszontes + " " + name;

        return kiirtsSzoveg;
    }
}
