package toguru.jesusfc.springpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import toguru.jesusfc.springpetclinic.model.Visit;
import toguru.jesusfc.springpetclinic.repositories.VisitRepository;
import toguru.jesusfc.springpetclinic.services.VisitService;

import java.util.HashSet;
import java.util.Set;

/**
 * Created By Jesús Fdez. Caraballo on 2021.
 */
@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSDJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit obj) {
        return visitRepository.save(obj);
    }

    @Override
    public void delete(Visit obj) {
        visitRepository.delete(obj);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
