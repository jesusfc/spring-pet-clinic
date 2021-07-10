package toguru.jesusfc.springpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import toguru.jesusfc.springpetclinic.model.Visit;

/**
 * Created By Jesús Fdez. Caraballo on 2021.
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
