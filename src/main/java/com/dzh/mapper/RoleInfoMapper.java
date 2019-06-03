package com.dzh.mapper;

import com.dzh.dto.RoleDto;
import com.dzh.pojo.RoleInfo;
import com.dzh.vo.RoleInfoVo;
import com.dzh.vo.Role_UserVo;

import java.util.List;

public interface RoleInfoMapper {

    List<RoleDto> getAllRoleBy(RoleInfoVo roleInfoVo);

    List<RoleInfo> getAllRole();

    List<RoleInfoVo> getAllRoleById(int userId);

    int pDelRoleById(int userId);

    int pUpdateRoleById(Role_UserVo role_userVo);
}
