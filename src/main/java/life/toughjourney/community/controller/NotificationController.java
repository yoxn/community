package life.toughjourney.community.controller;

import life.toughjourney.community.dto.NotificationDto;
import life.toughjourney.community.enums.NotificationTypeEnum;
import life.toughjourney.community.model.User;
import life.toughjourney.community.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by codedrinker on 2019/6/14.
 */
@Controller
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @GetMapping("/notification/{id}")
    public String profile(HttpServletRequest request,
                          @PathVariable(name = "id") Long id) {

        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            return "redirect:/";
        }
        NotificationDto notificationDto = notificationService.read(id, user);

        if (NotificationTypeEnum.REPLY_COMMENT.getType() == notificationDto.getType()
                || NotificationTypeEnum.REPLY_QUESTION.getType() == notificationDto.getType()) {
            return "redirect:/question/" + notificationDto.getOuterid();
        } else {
            return "redirect:/";
        }
    }
}
