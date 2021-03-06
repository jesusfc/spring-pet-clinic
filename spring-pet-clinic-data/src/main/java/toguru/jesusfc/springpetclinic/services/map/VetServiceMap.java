package toguru.jesusfc.springpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import toguru.jesusfc.springpetclinic.model.Speciality;
import toguru.jesusfc.springpetclinic.model.Vet;
import toguru.jesusfc.springpetclinic.services.SpecialtyService;
import toguru.jesusfc.springpetclinic.services.VetService;

import java.util.Set;

/**
 * Created By Jesús Fdez. Caraballo on 17/04/2021.
 */
@Service
@Profile({"default", "map"})
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }


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

        if (obj.getSpecialities().size() > 0){
            obj.getSpecialities().forEach(specialty -> {
                if (specialty.getId() == null) {
                    Speciality specialitySave = specialtyService.save(specialty);
                    specialty.setId(specialitySave.getId());
                }
            });
        }
        return super.save(obj);
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
