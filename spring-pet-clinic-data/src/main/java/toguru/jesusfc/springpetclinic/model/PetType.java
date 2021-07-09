package toguru.jesusfc.springpetclinic.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created By Jesús Fdez. Caraballo on 12/04/2021.
 */
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
