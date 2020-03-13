package proxy.mybatisSample;

import org.apache.ibatis.annotations.Select;

public interface UserDao {
    @Select("select * from XXXXX")
    void query();
}
