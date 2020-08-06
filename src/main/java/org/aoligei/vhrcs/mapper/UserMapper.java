package org.aoligei.vhrcs.mapper;

import org.aoligei.vhrcs.model.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface UserMapper {

    User loadUserByUsername(@Param("username") String username);

}
