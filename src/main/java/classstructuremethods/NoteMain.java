package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        note.setName("John Doe");
        note.setTopic("Programozás");
        note.setText("Egyszerű feladatok kivitelezése.");
        System.out.println(note.getNoteText());
    }
}
