package toguru.jesusfc.springpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import toguru.jesusfc.springpetclinic.model.Speciality;
import toguru.jesusfc.springpetclinic.services.SpecialtyService;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class SpecialtyServiceMap extends AbstractMapService<Speciality, Long> implements SpecialtyService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality obj) {
        super.delete(obj);
    }

    @Override
    public Speciality save(Speciality obj) {
        return super.save(obj);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
