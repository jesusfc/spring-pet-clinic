package toguru.jesusfc.springpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import toguru.jesusfc.springpetclinic.model.Speciality;
import toguru.jesusfc.springpetclinic.repositories.SpecialityRepository;
import toguru.jesusfc.springpetclinic.services.SpecialtyService;

import java.util.HashSet;
import java.util.Set;

/**
 * Created By Jesús Fdez. Caraballo on 2021.
 */
@Service
@Profile("springdatajpa")
public class SpecialtySDJpaService implements SpecialtyService {

    private final SpecialityRepository specialityRepository;

    public SpecialtySDJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality obj) {
        return specialityRepository.save(obj);
    }

    @Override
    public void delete(Speciality obj) {
        specialityRepository.delete(obj);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}
