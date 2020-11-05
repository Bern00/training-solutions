package classstructureattributes;

public class Music {
    public static void main(String[] args) {
        Song song = new Song();
        song.band = "Britney Spears";
        song.title = "Oops!...I Did It Again";
        song.length = 4;
        System.out.println(song.band);
        System.out.println(song.title);
        System.out.println(song.length + "perc");
    }
}
