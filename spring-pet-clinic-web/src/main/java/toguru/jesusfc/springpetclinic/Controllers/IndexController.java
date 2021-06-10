package toguru.jesusfc.springpetclinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created By Jesús Fdez. Caraballo on 17/04/2021.
 */
@Controller
public class IndexController {

    @RequestMapping(value = {"", "/", "index", "index.html"}, method = RequestMethod.GET)
    public String goIndexPage(Model model) {
        return "index";
    }

    @RequestMapping("/oups")
    public String oups() {
        return "notImplementYet";
    }

}
