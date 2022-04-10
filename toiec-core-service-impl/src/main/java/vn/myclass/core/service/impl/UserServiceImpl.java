package vn.myclass.core.service.impl;

import vn.myclass.core.dao.UserDao;
import vn.myclass.core.daoimpl.UserDaoImpl;
import vn.myclass.core.dto.UserDTO;
import vn.myclass.core.persistence.entity.UserEntity;
import vn.myclass.core.service.UserService;
import vn.myclass.core.utils.UserBeanUtil;

public class UserServiceImpl implements UserService {


    @Override
    public UserDTO isUserExit(UserDTO dto) {
        UserDao userDao = new UserDaoImpl() ;
        UserEntity userEntity = userDao.isUserExit(dto.getName(), dto.getPassword());

        return UserBeanUtil.entity2DTO(userEntity);
    }
    @Override
    public UserDTO findRoleByUser(UserDTO dto) {
        UserDao userDao = new UserDaoImpl() ;
        UserEntity userEntity = userDao.findRoleByName(dto.getName(), dto.getPassword());
        return UserBeanUtil.entity2DTO(userEntity);
    }
}
