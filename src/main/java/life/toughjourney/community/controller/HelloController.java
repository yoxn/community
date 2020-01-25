package life.toughjourney.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author YX
 * @version 1.0.0
 * @Description
 * @create 2020年01月24日 18:40:00
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name")String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}
