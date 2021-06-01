package toguru.jesusfc.springpetclinic.model;

import java.util.Set;

/**
 * Created By Jesús Fdez. Caraballo on 12/04/2021.
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
