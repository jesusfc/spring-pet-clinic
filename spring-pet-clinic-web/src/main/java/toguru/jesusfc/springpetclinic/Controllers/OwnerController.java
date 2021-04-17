package toguru.jesusfc.springpetclinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created By Jesús Fdez. Caraballo on 17/04/2021.
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping(value = {"", "/", "/ownerList"}, method = RequestMethod.GET)
    public String goListVetsView(Model model) {
        return "owners/index";
    }

}
