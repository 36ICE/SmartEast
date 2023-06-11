package com.i36ice.user.mapper;


import com.i36ice.user.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User findByUsername(String username);

}
