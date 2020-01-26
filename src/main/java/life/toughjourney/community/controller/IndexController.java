package life.toughjourney.community.controller;

import life.toughjourney.community.mapper.UserMapper;
import life.toughjourney.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @author YX
 * @version 1.0.0
 * @Description
 * @create 2020年01月24日 18:40:00
 */
@Controller
public class IndexController {

    @Autowired
    private UserMapper userMapper;
    @GetMapping("/ ")
    public String index(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        for(Cookie cookie : cookies){
            if ("token".equals(cookie.getName()) ){
                String token = cookie.getValue();
                User user = userMapper.findByToken(token);
                if(user != null){
                    request.getSession().setAttribute("user",user);
                }
                break;
            }
        }
        return "index";
    }
}
