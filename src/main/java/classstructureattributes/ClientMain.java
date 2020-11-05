package classstructureattributes;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.name = "Bernát";
        client.year = 1991;
        client.addres = "Bp. Minden utca 3.";
        System.out.println(client.name);
        System.out.println(client.year);
        System.out.println(client.addres);
    }
}
