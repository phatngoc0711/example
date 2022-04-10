package vn.myclass.core.utils;

import vn.myclass.core.dto.UserDTO;
import vn.myclass.core.persistence.entity.UserEntity;

public class UserBeanUtil {
    public static UserDTO entity2DTO(UserEntity entity) {
        UserDTO dto =new UserDTO();
        dto.setUserId(entity.getUserId());
        dto.setName(entity.getName());
        dto.setPassword(entity.getPassword());
        dto.setFullName(entity.getFullName());
        dto.setCreateDate(entity.getCreateDate());
        dto.setRoleDTO(RoleBeanUtil.entity2Dto(entity.getRole()));
        return dto;
    }

    public static UserEntity dto2Entity(UserDTO dto) {
        UserEntity entity = new UserEntity();
        entity.setUserId(dto.getUserId());
        entity.setName(dto.getName());
        entity.setPassword(dto.getPassword());
        entity.setFullName(dto.getFullName());
        entity.setCreateDate(dto.getCreateDate());
        entity.setRole(RoleBeanUtil.dto2Entity(dto.getRoleDTO()));
        return entity;
    }
}
