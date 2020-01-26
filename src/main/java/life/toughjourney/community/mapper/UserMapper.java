package life.toughjourney.community.mapper;

import life.toughjourney.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author YX
 * @version 1.0.0
 * @Description
 * @create 2020年01月26日 14:13:00
 */
@Mapper
public interface UserMapper {

    @Insert("insert into user (name,account_id,token,gmt_create,gmt_modified) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);


}
