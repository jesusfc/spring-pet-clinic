package toguru.jesusfc.springpetclinic.services.map;

import org.springframework.stereotype.Service;
import toguru.jesusfc.springpetclinic.model.Pet;
import toguru.jesusfc.springpetclinic.services.CrudService;
import toguru.jesusfc.springpetclinic.services.PetService;

import java.util.Set;

/**
 * Created By Jesús Fdez. Caraballo on 17/04/2021.
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet obj) {
        super.delete(obj);
    }

    @Override
    public Pet save(Pet obj) {
        return super.save(obj.getId(), obj);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
