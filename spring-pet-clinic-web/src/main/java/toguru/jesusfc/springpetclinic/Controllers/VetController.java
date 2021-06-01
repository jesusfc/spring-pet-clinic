package toguru.jesusfc.springpetclinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import toguru.jesusfc.springpetclinic.services.VetService;

/**
 * Created By Jesús Fdez. Caraballo on 17/04/2021.
 */
@RequestMapping("/vets")
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping(value = {"", "/", "/vetList", "/find"}, method = RequestMethod.GET)
    public String goListVetsView(Model model) {

        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }

}
