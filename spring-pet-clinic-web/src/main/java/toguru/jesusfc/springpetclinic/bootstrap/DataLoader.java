package toguru.jesusfc.springpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import toguru.jesusfc.springpetclinic.model.*;
import toguru.jesusfc.springpetclinic.services.*;

import java.time.LocalDate;

/**
 * Created By Jesús Fdez. Caraballo on 2021.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetService petService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetService petService, PetTypeService petTypeService, SpecialtyService specialtyService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petService = petService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if (count == 0) loadData();
    }


    private void loadData() {
        System.out.println("Loading Specialties......");
        Speciality radiology = new Speciality();
        radiology.setDescription("radiology");
        Speciality saveRadiology = specialtyService.save(radiology);
        Speciality surgery = new Speciality();
        surgery.setDescription("surgery");
        Speciality saveSurgery = specialtyService.save(surgery);
        Speciality dentistry = new Speciality();
        dentistry.setDescription("dentistry");
        Speciality saveDentistry = specialtyService.save(dentistry);

        System.out.println("Loading PetType......");
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        System.out.println("Loading Owners......");

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Jesús");
        owner1.setLastName("Fdez");
        owner1.setAddress("123 Mi calle");
        owner1.setTelephone("654987978");
        owner1.setCity("Alcudia");
        ownerService.save(owner1);

        Pet jesusPet = new Pet();
        jesusPet.setPetType(savedDogPetType);
        jesusPet.setOwner(owner1);
        jesusPet.setBirthDate(LocalDate.now());
        jesusPet.setName("Rocco");
        petService.save(jesusPet);
        owner1.getPets().add(jesusPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Marina");
        owner2.setLastName("Vives");
        owner2.setAddress("Mi Ciutadella 2");
        owner2.setTelephone("4324234234");
        owner2.setCity("Alcudia");
        ownerService.save(owner2);

        Pet marinaCinco = new Pet();
        marinaCinco.setPetType(savedCatPetType);
        marinaCinco.setName("Cinco");
        marinaCinco.setOwner(owner2);
        marinaCinco.setBirthDate(LocalDate.now());
        petService.save(marinaCinco);
        owner2.getPets().add(marinaCinco);
        ownerService.save(owner2);

        System.out.println("Loaded Owners!!!!");

        System.out.println("Loading Vet......");
        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Lucas");
        vet1.setLastName("Sky");
        vet1.getSpecialities().add(saveDentistry);
        vet1.getSpecialities().add(saveRadiology);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Ray");
        vet2.setLastName("Walker");
        vet2.getSpecialities().add(saveSurgery);
        vetService.save(vet2);

        System.out.println("Loader Vet......");

        System.out.println("Loading Visit......");
        Visit catVisit = new Visit();
        catVisit.setPet(jesusPet);
        catVisit.setDescription("Visit sorpresa");
        catVisit.setDate(LocalDate.now());
        visitService.save(catVisit);
        System.out.println("Loader Visit......");

    }
}
