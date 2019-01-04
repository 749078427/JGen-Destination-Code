package hello.springboot.dao;


import hello.springboot.model.UserDomain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserDao {


    int insert(UserDomain record);

    List<UserDomain> selectUsers();
}