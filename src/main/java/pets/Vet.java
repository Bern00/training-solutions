package pets;

import java.util.ArrayList;
import java.util.List;

public class Vet {

    List<Pet> pets = new ArrayList<>();

    private void areEquals(String numberOfPet) {

        for(Pet pet: pets) {
            if(!numberOfPet.equals(pet.getRegistrationNumber())) {
                pets.add(pet);
            }
        }
    }

    public List<Pet> getPets() {
        return pets;
    }
}
