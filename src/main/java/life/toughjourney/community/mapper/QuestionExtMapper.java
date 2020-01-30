package life.toughjourney.community.mapper;

import life.toughjourney.community.model.Question;

public interface QuestionExtMapper {

    int incView(Question record);
    int incCommentCount(Question record);
}