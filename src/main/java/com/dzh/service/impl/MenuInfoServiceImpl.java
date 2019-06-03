package com.dzh.service.impl;

import com.dzh.dto.AssignPermissionDto;
import com.dzh.dto.MenuInfoDto;
import com.dzh.mapper.MenuInfoMapper;
import com.dzh.service.MenuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuInfoServiceImpl implements MenuInfoService {

    @Autowired
    MenuInfoMapper menuInfoMapper;

    public List<MenuInfoDto> showMenuInfo() {
        return menuInfoMapper.showMenuInfo();
    }

    public List<MenuInfoDto> showMenuInfoByUserId(int userId) {
        return menuInfoMapper.showMenuInfoByUserId(userId);
    }

    public List<MenuInfoDto> showMenuInfoByRoleId(int roleId) {
        return menuInfoMapper.showMenuInfoByRoleId(roleId);
    }

    public int pDelAssignPermission(int roleId) {
        return menuInfoMapper.pDelAssignPermission(roleId);
    }

    public int pUpdateAssignPermission(AssignPermissionDto assignPermissionDto) {
        return menuInfoMapper.pUpdateAssignPermission(assignPermissionDto);
    }
}
