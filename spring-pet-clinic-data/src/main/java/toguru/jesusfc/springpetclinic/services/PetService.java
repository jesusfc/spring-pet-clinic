package toguru.jesusfc.springpetclinic.services;

import toguru.jesusfc.springpetclinic.model.Pet;

import java.util.Set;

/**
 * Created By Jesús Fdez. Caraballo on 14/04/2021.
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
