package toguru.jesusfc.springpetclinic.services.map;

import org.springframework.stereotype.Service;
import toguru.jesusfc.springpetclinic.model.Owner;
import toguru.jesusfc.springpetclinic.model.Pet;
import toguru.jesusfc.springpetclinic.services.OwnerService;
import toguru.jesusfc.springpetclinic.services.PetService;
import toguru.jesusfc.springpetclinic.services.PetTypeService;

import java.util.Set;

/**
 * Created By Jesús Fdez. Caraballo on 17/04/2021.
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

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
        if (obj != null) {
            if(obj.getPets() != null) {
                obj.getPets().forEach(pet -> {
                    if(pet.getPetType() != null){
                        if(pet.getPetType().getId() == null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    }
                    if (pet.getId() == null) {
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
        }
        return super.save(obj);
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
