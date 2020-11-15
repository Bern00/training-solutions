package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello";
        String name = "John Doe";
        String message = prefix + " " + name;
        message = message + 444;
        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");

        String s1 = "";
        String s2 = "";
        String a = s1.concat(s2);
        System.out.println(a.length());
        String d = "Abcde";
        System.out.println(d.length());
        System.out.println(d.charAt(0) + "," + d.charAt(2));
        System.out.println(d.substring(0, 3));

    }
}
