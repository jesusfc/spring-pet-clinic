package toguru.jesusfc.springpetclinic.services.map;

import org.springframework.stereotype.Service;
import toguru.jesusfc.springpetclinic.model.Pet;
import toguru.jesusfc.springpetclinic.model.PetType;
import toguru.jesusfc.springpetclinic.services.PetService;
import toguru.jesusfc.springpetclinic.services.PetTypeService;
import toguru.jesusfc.springpetclinic.services.map.AbstractMapService;

import java.util.Set;

/**
 * Created By Jesús Fdez. Caraballo on 2021.
 */
@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public PetType save(PetType obj) {
        return super.save(obj);
    }

    @Override
    public void delete(PetType obj) {
        super.delete(obj);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
