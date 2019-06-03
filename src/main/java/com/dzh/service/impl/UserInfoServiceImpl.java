package com.dzh.service.impl;

import com.dzh.dto.RoleDto;
import com.dzh.dto.UserIdArrays;
import com.dzh.mapper.UserInfoMapper;
import com.dzh.pojo.UserInfo;
import com.dzh.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    public UserInfo userLogin(UserInfo userInfo) {
        UserInfo userInfos = userInfoMapper.userLogin(userInfo);
        if (userInfo != null) {
            return userInfos;
        }
        return null;
    }

    public List<UserInfo> listAllUserInfo() {
        return userInfoMapper.listAllUserInfo();
    }

    public UserInfo getUserInfoById(int userId) {
        return userInfoMapper.getUserInfoById(userId);
    }

    public int insertUserInfo(UserInfo userInfo) {
        int i = userInfoMapper.insertUserInfo(userInfo);

        if (i > 0) {
            return i;
        }
        return 0;
    }

    public int delUserInfoById(int userid) {
        int i = userInfoMapper.delUserInfoById(userid);
        if (i>0) {
            return i;
        }
        return 0;
    }

    public List<UserInfo> selectUserInfoBy(String comdition) {
        if(comdition.equals("") || comdition==null){
            return userInfoMapper.listAllUserInfo();
        }else{
            return userInfoMapper.selectUserInfoBy(comdition);
        }
    }

    public int pDelUserInfoById(UserIdArrays userIdArrays) {
        return userInfoMapper.pDelUserInfoById(userIdArrays);
    }

    public List<RoleDto> listRoleDtoByUserId(int userId) {
        return userInfoMapper.listRoleDtoByUserId(userId);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public int upDateUserInfoById(UserInfo userInfo) {
        int i = userInfoMapper.upDateUserInfoById(userInfo);
        if (i != 0) {
            return i;
        }
        return 0;
    }


}
