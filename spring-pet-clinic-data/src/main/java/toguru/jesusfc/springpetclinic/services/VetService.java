package toguru.jesusfc.springpetclinic.services;

import toguru.jesusfc.springpetclinic.model.Pet;
import toguru.jesusfc.springpetclinic.model.Vet;

import java.util.Set;

/**
 * Created By Jesús Fdez. Caraballo on 14/04/2021.
 */
public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}


