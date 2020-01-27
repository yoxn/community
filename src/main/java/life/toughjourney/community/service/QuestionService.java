package life.toughjourney.community.service;

import life.toughjourney.community.dto.PaginationDto;
import life.toughjourney.community.dto.QuestionDto;
import life.toughjourney.community.mapper.QuestionMapper;
import life.toughjourney.community.mapper.UserMapper;
import life.toughjourney.community.model.Question;
import life.toughjourney.community.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YX
 * @version 1.0.0
 * @Description
 * @create 2020年01月27日 17:06:00
 */
@Service
public class QuestionService {
    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private UserMapper userMapper;

    public PaginationDto list(Integer page, Integer size) {
        PaginationDto paginationDto = new PaginationDto();

        Integer totalCount = questionMapper.count();
        paginationDto.setPagination(totalCount,page,size);
        if (page < 1) {
            page = 1;
        }
        if(page > paginationDto.getTotalPage()){
            page = paginationDto.getTotalPage();
        }
        Integer offset = size * (page - 1);

        List<Question> questions = questionMapper.list(offset, size);
        List<QuestionDto> questionDtoList = new ArrayList<>();

        for (Question question : questions) {
            User user = userMapper.findById(question.getCreator());
            QuestionDto questionDto = new QuestionDto();
            BeanUtils.copyProperties(question, questionDto);
            questionDto.setUser(user);
            questionDtoList.add(questionDto);
        }
        paginationDto.setQuestions(questionDtoList);

        return paginationDto;
    }
}
