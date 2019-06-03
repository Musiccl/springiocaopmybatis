package com.dzh.control;

import com.dzh.service.RoleInfoService;
import com.dzh.vo.RoleInfoVo;
import com.dzh.vo.Role_UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class RoleInfoController {

    @Autowired
    RoleInfoService roleInfoService;

    @RequestMapping("getAllRoleBy")
    public Object getAllRoleBy(@RequestBody RoleInfoVo roleInfoVo) {
        return roleInfoService.getAllRoleBy(roleInfoVo);
    }

    @RequestMapping("getAllRole")
    public Object getAllRole() {
        return roleInfoService.getAllRole();
    }

    @RequestMapping("getAllRoleById")
    public Object getAllRoleById(@RequestParam int userId) {
        return roleInfoService.getAllRoleById(userId);
    }

    @RequestMapping(value = "pUpDateRoleById")
    public Object pDelUserInfoById(@RequestParam(value="isSelectedList", required = false, defaultValue = "") Integer[] isSelectedList,@RequestParam int userId) {
        List<Integer> list = Arrays.asList(isSelectedList);
        Role_UserVo role_userVo = new Role_UserVo();
        role_userVo.setUserId(userId);
        role_userVo.setRoleId(list);
        roleInfoService.pDelRoleById(userId);
        return roleInfoService.pUpdateRoleById(role_userVo);
    }
}
