package toguru.jesusfc.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import toguru.jesusfc.springpetclinic.model.Vet;

/**
 * Created By Jesús Fdez. Caraballo on 2021.
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
