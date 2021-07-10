package toguru.jesusfc.springpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import toguru.jesusfc.springpetclinic.model.PetType;
import toguru.jesusfc.springpetclinic.repositories.PetTypeRepository;
import toguru.jesusfc.springpetclinic.services.PetTypeService;

import java.util.HashSet;
import java.util.Set;

/**
 * Created By Jesús Fdez. Caraballo on 2021.
 */
@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType obj) {
        return petTypeRepository.save(obj);
    }

    @Override
    public void delete(PetType obj) {
        petTypeRepository.delete(obj);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);
    }
}
