package life.toughjourney.community.mapper;

import life.toughjourney.community.dto.QuestionQueryDto;
import life.toughjourney.community.model.Question;

import java.util.List;

public interface QuestionExtMapper {

    int incView(Question record);
    int incCommentCount(Question record);
    List<Question> selectRelated(Question question);

    Integer countBySearch(QuestionQueryDto questionQueryDTO);
    List<Question> selectBySearch(QuestionQueryDto questionQueryDto);
}