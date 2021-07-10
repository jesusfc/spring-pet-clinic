package toguru.jesusfc.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import toguru.jesusfc.springpetclinic.model.PetType;

/**
 * Created By Jesús Fdez. Caraballo on 2021.
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
