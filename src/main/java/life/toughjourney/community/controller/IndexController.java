package life.toughjourney.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author YX
 * @version 1.0.0
 * @Description
 * @create 2020年01月24日 18:40:00
 */
@Controller
public class IndexController {

    @GetMapping("/ ")
    public String index(){
        return "index";
    }
}
