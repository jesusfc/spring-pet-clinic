package toguru.jesusfc.springpetclinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created By Jesús Fdez. Caraballo on 17/04/2021.
 */
@Controller
public class VetController {

    @RequestMapping(value = {"/vet", "/vetList"}, method = RequestMethod.GET)
    public String goListVetsView(Model model) {
        return "vets/index";
    }

}