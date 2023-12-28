package com.example.bootrestart.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.bootrestart.entity.Order;
import com.example.bootrestart.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
    @Select("select * from t_order where uid = #{uid}")
    public List<Order> selectByUid(int uid);

    @Select("select * from t_order")
    @Results(
            {
                    @Result(column = "id", property = "id"),
                    @Result(column = "order_time", property = "orderTime"),
                    @Result(column = "total", property = "total"),
                    @Result(column = "uid", property = "user",javaType = User.class,
                        one = @One(select = "com.example.bootrestart.mapper.UserMapper.selectById")
                    )
            }
    )
    List<Order> selectAllOrderAndUser();

}
