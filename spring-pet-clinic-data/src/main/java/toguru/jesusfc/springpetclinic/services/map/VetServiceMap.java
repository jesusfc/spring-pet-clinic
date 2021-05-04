package toguru.jesusfc.springpetclinic.services.map;

import toguru.jesusfc.springpetclinic.model.Vet;
import toguru.jesusfc.springpetclinic.services.CrudService;
import toguru.jesusfc.springpetclinic.services.VetService;

import java.util.Set;

/**
 * Created By Jesús Fdez. Caraballo on 17/04/2021.
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Vet save(Vet obj) {
        return super.save(obj.getId(), obj);
    }

    @Override
    public void delete(Vet obj) {
        super.delete(obj);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
