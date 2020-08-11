package org.aoligei.vhrcs.service.impl;


import org.aoligei.vhrcs.mapper.RolesMapper;
import org.aoligei.vhrcs.mapper.UserMapper;
import org.aoligei.vhrcs.model.entity.Role;
import org.aoligei.vhrcs.model.entity.User;
import org.aoligei.vhrcs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;
    @Autowired
    RolesMapper rolesMapper;
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userMapper.loadUserByUsername(s);
        if (user == null) {
            //避免返回null，这里返回一个不含有任何值的User对象，在后期的密码比对过程中一样会验证失败
            return new User();
        }
        //查询用户的角色信息，并返回存入user中
        List<Role> roles = rolesMapper.getRolesByUid(user.getId());
        user.setRoles(roles);
        return user;

    }
}
