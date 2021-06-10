package toguru.jesusfc.springpetclinic.services.map;

import org.springframework.stereotype.Service;
import toguru.jesusfc.springpetclinic.model.Specialty;
import toguru.jesusfc.springpetclinic.services.SpecialtyService;

import java.util.Set;

@Service
public class SpecialtyServiceMap extends AbstractMapService<Specialty, Long> implements SpecialtyService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Specialty obj) {
        super.delete(obj);
    }

    @Override
    public Specialty save(Specialty obj) {
        return super.save(obj);
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }
}
