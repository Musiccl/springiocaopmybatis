package com.dzh.mapper;

import com.dzh.dto.AssignPermissionDto;
import com.dzh.dto.MenuInfoDto;

import java.util.List;

public interface MenuInfoMapper {

    List<MenuInfoDto> showMenuInfo();

    List<MenuInfoDto> showMenuInfoByUserId(int userId);

    List<MenuInfoDto> showMenuInfoByRoleId(int roleId);

    int pDelAssignPermission(int roleId);

    int pUpdateAssignPermission(AssignPermissionDto assignPermissionDto);
}
