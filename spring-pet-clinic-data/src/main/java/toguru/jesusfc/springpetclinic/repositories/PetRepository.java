package toguru.jesusfc.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import toguru.jesusfc.springpetclinic.model.Pet;

/**
 * Created By Jesús Fdez. Caraballo on 2021.
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
