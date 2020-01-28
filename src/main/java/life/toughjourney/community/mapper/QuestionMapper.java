package life.toughjourney.community.mapper;

import life.toughjourney.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author YX
 * @version 1.0.0
 * @Description
 * @create 2020年01月27日 10:27:00
 */
@Component
@Mapper
public interface QuestionMapper {

    @Insert("insert into question (title,description,gmt_create,gmt_modified,creator,tag) values (#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{tag})")
    void create(Question question);

    @Select("select * from question limit #{offset},#{size}")
    List<Question> list(@Param(value = "offset")Integer offset, @Param(value = "size")Integer size);

    @Select("select count(1) from question")
    Integer count();

    @Select("select * from question where creator = #{userId} limit #{offset},#{size}")
    List<Question> listByUserId(@Param(value = "userId")Integer userId, @Param(value = "offset")Integer offset, @Param(value = "size")Integer size);

    @Select("select count(1) from question where creator = #{userId}")
    Integer countByUserId(@Param(value = "userId")Integer userId);
}
