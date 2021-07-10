package toguru.jesusfc.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import toguru.jesusfc.springpetclinic.model.Owner;

/**
 * Created By Jesús Fdez. Caraballo on 2021.
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String name);
}
