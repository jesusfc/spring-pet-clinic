package toguru.jesusfc.springpetclinic.services;

import toguru.jesusfc.springpetclinic.model.Owner;

import java.util.Set;

/**
 * Created By Jesús Fdez. Caraballo on 14/04/2021.
 */
public interface OwnerService {

    Owner findByLastName(String name);

    Owner findById(Long Id);

    Owner save(Owner owner);

    Set<Owner> findAll();


}
