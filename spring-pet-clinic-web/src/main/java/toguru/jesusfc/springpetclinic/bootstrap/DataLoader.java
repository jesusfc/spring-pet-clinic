package toguru.jesusfc.springpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import toguru.jesusfc.springpetclinic.model.Owner;
import toguru.jesusfc.springpetclinic.model.Vet;
import toguru.jesusfc.springpetclinic.services.OwnerService;
import toguru.jesusfc.springpetclinic.services.VetService;

/**
 * Created By Jesús Fdez. Caraballo on 2021.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading Owners......");

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstname("Jesús");
        owner1.setLastName("Fdez");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstname("Marina");
        owner2.setLastName("Vives");
        ownerService.save(owner2);

        System.out.println("Loaded Owners!!!!");

        System.out.println("Loading Vet......");
        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstname("Lucas");
        vet1.setLastName("Sky");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstname("Ray");
        vet2.setLastName("Walker");
        vetService.save(vet2);

        System.out.println("Loader Vet......");
    }
}
