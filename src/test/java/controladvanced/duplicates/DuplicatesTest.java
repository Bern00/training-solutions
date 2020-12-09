package controladvanced.duplicates;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import java.util.Arrays;

import junit.framework.TestCase;

import java.util.List;

public class DuplicatesTest {

    @Test
    public void testFindDuplicates() {

        //Given
        Duplicates duplicates = new Duplicates();

        //When
        List<Integer> a = duplicates.findDuplicates();

        //Then
        assertThat(a, equalTo(Arrays.asList(1, 3, 2, 6)));

    }

}