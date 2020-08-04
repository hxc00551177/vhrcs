package org.aoligei.vhrcs.mapper;

import org.aoligei.vhrcs.model.Role;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;


@Mapper
public interface RolesMapper {

    List<Role> getRolesByUid(Long uid);
}
