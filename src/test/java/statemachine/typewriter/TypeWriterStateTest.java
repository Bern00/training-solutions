package statemachine.typewriter;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

public class TypeWriterStateTest {

    @Test
    public void testNext() {

        assertThat(TypeWriterState.LOWER_CASE.next(), is(TypeWriterState.UPPER_CASE));
        assertThat(TypeWriterState.UPPER_CASE.next(), is(TypeWriterState.LOWER_CASE));
    }
}