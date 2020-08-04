package org.aoligei.vhrcs.mapper;

import org.aoligei.vhrcs.model.Role;
import org.aoligei.vhrcs.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface UserMapper {

    User loadUserByUsername(@Param("username") String username);

}
