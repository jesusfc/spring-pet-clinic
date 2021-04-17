package toguru.jesusfc.springpetclinic.services;

import java.util.Set;

/**
 * Created By Jesús Fdez. Caraballo on 17/04/2021.
 * My Custom CRUD service
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save (T obj);

    void delete(T obj);

    void deleteById(ID id);

}
