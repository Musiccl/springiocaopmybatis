package com.dzh.service.impl;

import com.dzh.dto.RoleDto;
import com.dzh.mapper.RoleInfoMapper;
import com.dzh.pojo.RoleInfo;
import com.dzh.service.RoleInfoService;
import com.dzh.vo.RoleInfoVo;
import com.dzh.vo.Role_UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleInfoServiceImpl implements RoleInfoService {

    @Autowired
    RoleInfoMapper roleInfoMapper;
    public List<RoleDto> getAllRoleBy(RoleInfoVo roleInfoVo) {
        return roleInfoMapper.getAllRoleBy(roleInfoVo);
    }

    public List<RoleInfo> getAllRole() {
        return roleInfoMapper.getAllRole();
    }

    public List<RoleInfoVo> getAllRoleById(int userId) {
        return roleInfoMapper.getAllRoleById(userId);
    }

    public int pDelRoleById(int userId) {
        return roleInfoMapper.pDelRoleById(userId);
    }

    public int pUpdateRoleById(Role_UserVo role_userVo) {
        return roleInfoMapper.pUpdateRoleById(role_userVo);
    }
}
