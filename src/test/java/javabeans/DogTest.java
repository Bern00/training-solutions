package javabeans;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void getSetName() {
        Dog dog = new Dog();
        dog.setName("Bodri");
        assertEquals("Bodri", dog.getName());
    }

    @Test
    public void isSetPedigree() {
        Dog dog = new Dog();
        dog.setPedigree(true);
        assertTrue(dog.isPedigree());
        dog.setPedigree(false);
        assertFalse(dog.isPedigree());
    }

    @Test
    public void getSetAge() {
        Dog dog = new Dog();
        dog.setAge(8);
        assertEquals(8, dog.getAge());
    }

    @Deprecated
    public void getSetWeight() {
        final double weight = 6.5;
        Dog dog = new Dog();
        dog.setWeight(weight);

        assertEquals(weight, dog.getWeight());
    }

}