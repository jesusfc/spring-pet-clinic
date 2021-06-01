package toguru.jesusfc.springpetclinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import toguru.jesusfc.springpetclinic.services.OwnerService;

/**
 * Created By Jesús Fdez. Caraballo on 17/04/2021.
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping(value = {"", "/", "/ownerList", "/find"}, method = RequestMethod.GET)
    public String golistOwnersView(Model model) {

        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }

}
