package com.dzh.service;

import com.dzh.dto.RoleDto;
import com.dzh.dto.UserIdArrays;
import com.dzh.pojo.UserInfo;

import java.util.List;

public interface UserInfoService {
    UserInfo userLogin(UserInfo userInfo);

    int upDateUserInfoById(UserInfo userInfo);

    List<UserInfo> listAllUserInfo();

    UserInfo getUserInfoById(int userId);

    int insertUserInfo(UserInfo userInfo);

    int delUserInfoById(int userid);

    List<UserInfo> selectUserInfoBy(String comdition);

    int pDelUserInfoById(UserIdArrays userIdArrays);

    List<RoleDto> listRoleDtoByUserId(int userId);
}
