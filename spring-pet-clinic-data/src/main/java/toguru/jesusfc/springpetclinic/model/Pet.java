package toguru.jesusfc.springpetclinic.model;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created By Jesús Fdez. Caraballo on 12/04/2021.
 */
@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {

    @Column(name = "name")
    private String name;

    @ManyToOne()
    @JoinColumn(name = "type_id")
    private PetType petType;

    @JoinColumn(name = "owner_id")
    @ManyToOne
    private Owner owner;

    @Column(name = "birth_date")
    private LocalDate birthDate;


    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
