package toguru.jesusfc.springpetclinic.services.map;

import toguru.jesusfc.springpetclinic.model.Owner;
import toguru.jesusfc.springpetclinic.services.CrudService;
import toguru.jesusfc.springpetclinic.services.OwnerService;

import java.util.Set;

/**
 * Created By Jesús Fdez. Caraballo on 17/04/2021.
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner save(Owner obj) {
        return super.save(obj.getId(), obj);
    }

    @Override
    public void delete(Owner obj) {
        super.delete(obj);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String name) {
        return null;
    }
}
