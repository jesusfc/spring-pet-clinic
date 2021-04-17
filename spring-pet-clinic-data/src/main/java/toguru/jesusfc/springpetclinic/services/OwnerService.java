package toguru.jesusfc.springpetclinic.services;

import toguru.jesusfc.springpetclinic.model.Owner;

/**
 * Created By Jesús Fdez. Caraballo on 14/04/2021.
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String name);

}
