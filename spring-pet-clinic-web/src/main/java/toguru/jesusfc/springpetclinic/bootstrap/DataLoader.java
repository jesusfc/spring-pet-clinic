package toguru.jesusfc.springpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import toguru.jesusfc.springpetclinic.model.Owner;
import toguru.jesusfc.springpetclinic.model.Pet;
import toguru.jesusfc.springpetclinic.model.PetType;
import toguru.jesusfc.springpetclinic.model.Vet;
import toguru.jesusfc.springpetclinic.services.OwnerService;
import toguru.jesusfc.springpetclinic.services.PetService;
import toguru.jesusfc.springpetclinic.services.PetTypeService;
import toguru.jesusfc.springpetclinic.services.VetService;

import java.time.LocalDate;

/**
 * Created By Jesús Fdez. Caraballo on 2021.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading PetType......");
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        System.out.println("Loading Owners......");

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Jesús");
        owner1.setLastName("Fdez");
        owner1.setAddress("123 Mi calle");
        owner1.setTelephone("654987978");
        owner1.setCity("Alcudia");

        Pet jesusPet = new Pet();
        jesusPet.setPetType(savedDogPetType);
        jesusPet.setOwner(owner1);
        jesusPet.setBirthDate(LocalDate.now());
        jesusPet.setName("Rocco");
        owner1.getPets().add(jesusPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Marina");
        owner2.setLastName("Vives");
        owner2.setAddress("Mi Ciutadella 2");
        owner2.setTelephone("4324234234");
        owner2.setCity("Alcudia");

        Pet marinaCinco = new Pet();
        marinaCinco.setPetType(cat);
        marinaCinco.setName("Cinco");
        marinaCinco.setOwner(owner2);
        marinaCinco.setBirthDate(LocalDate.now());
        owner2.getPets().add(marinaCinco);
        ownerService.save(owner2);

        System.out.println("Loaded Owners!!!!");

        System.out.println("Loading Vet......");
        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Lucas");
        vet1.setLastName("Sky");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Ray");
        vet2.setLastName("Walker");
        vetService.save(vet2);

        System.out.println("Loader Vet......");
    }
}
