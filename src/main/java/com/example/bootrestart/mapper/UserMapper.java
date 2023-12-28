package com.example.bootrestart.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bootrestart.entity.User;

import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("select * from t_user")
    @Results(
            {//（{}）处理结果集，所有字段都要进行匹配
                    @Result(column = "id",property = "id"),
                    @Result(column = "name",property = "username"),
                    @Result(column = "password",property = "password"),
                    @Result(column = "birthday",property = "birthday"),
                    //order是根据id关联查询到的;一个用户id对应多个订单
                    @Result(column = "id",property = "orders",javaType = List.class,
                                many = @Many(select = "com.example.bootrestart.mapper.OrderMapper.selectByUid")
                    )
            }
    )
    public List<User> getAllUser();


//    @Select("select * from user")
//    public List<User> find();
//
//    @Update("update user set username=#{username},password=#{password},birthday=#{birthday}")
//    int update(User user);
//
//    @Insert("insert into user values(#{id},#{username},#{password},#{birthday})")
//    int add(User user);
//
//    @Delete("delete * from user where id=#{id}")
//    int delete(int id);
}
