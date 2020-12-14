package stringconcat.employee;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class EmployeeTest {

    @Test
    public void testTestToString() {
        //Given
        Employee employee = new Employee("Kis Géza", "földműves", 872000);

        //When
        String kontatenal = employee.toString();

        //Then
        assertThat(kontatenal, equalTo("Kis Géza - földműves - 872000 Ft"));
    }

}