package toguru.jesusfc.springpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created By Jesús Fdez. Caraballo on 12/04/2021.
 */
public class Vet extends Person {

    private Set<Specialty> specialities = new HashSet<>();;

    public Set<Specialty> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Specialty> specialities) {
        this.specialities = specialities;
    }
}
