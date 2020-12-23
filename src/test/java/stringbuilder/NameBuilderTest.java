package stringbuilder;


import org.junit.Test;
import stringmethods.filename.FileNameManipulator;

import static org.junit.jupiter.api.Assertions.*;

public class NameBuilderTest {



    @Test
    public void testConcatNameWesternStyle() {
        assertEquals("Dr. János Kiss", new NameBuilder("Kiss", "", "János", Title.DR).concatNameWesternStyle());
    }

    @Test
    public void testConcatNameHungarianStyle() {
        assertEquals("Dr. Kiss János", new NameBuilder("Kiss", "", "János", Title.DR).concatNameHungarianStyle());
    }

    @Test
    public void testInsertTitle() {
        assertEquals("Dr. Kiss Árpád", new NameBuilder("Kiss", "", "Árpád", Title.DR).insertTitle("Kiss Árpád", Title.DR, "K"));
    }

    @Test
    public void testDeleteNamePart() {
        assertEquals("Ki Árpád", new NameBuilder("Kiss", "", "Árpád", Title.DR).deleteNamePart("Kiss Árpád", "ss"));
    }
}