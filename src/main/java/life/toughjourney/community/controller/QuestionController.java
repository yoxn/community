package life.toughjourney.community.controller;

import life.toughjourney.community.dto.QuestionDto;
import life.toughjourney.community.mapper.QuestionMapper;
import life.toughjourney.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.jws.WebParam;

/**
 * @author YX
 * @version 1.0.0
 * @Description
 * @create 2020年01月28日 12:58:00
 */
@Controller
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping("question/{id}")
    public String question(@PathVariable(name = "id")Integer id,
                           Model model){
        QuestionDto questionDto = questionService.getById(id);
        model.addAttribute("question",questionDto);
        return "question";
    }
}
