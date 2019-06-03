package com.dzh.control;

import com.dzh.dto.AssignPermissionDto;
import com.dzh.pojo.UserInfo;
import com.dzh.service.MenuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

@RestController
public class MenuInfoController {

    @Autowired
    MenuInfoService menuInfoService;

    @RequestMapping("showMenuInfo")
    public Object showMenuInfo() {
        return menuInfoService.showMenuInfo();
    }

    @RequestMapping("showMenuInfoById")
    public Object showMenuInfoByUserId(HttpSession httpSession) {
        UserInfo userInfo = (UserInfo)httpSession.getAttribute("userInfo");
        int userId = userInfo.getUserId();
        return menuInfoService.showMenuInfoByUserId(userId);
    }

    @RequestMapping("showMenuInfoByRoleId")
    public Object showMenuInfoByRoleId(@RequestParam int roleId) {
        return menuInfoService.showMenuInfoByRoleId(roleId);
    }

    @RequestMapping("pUpdateAssignPermission")
    public Object pUpdateAssignPermission(@RequestParam(value="checkeds", required = false, defaultValue = "") Integer[] checkeds, @RequestParam int roleId) {
        List<Integer> checkedList = Arrays.asList(checkeds);
        AssignPermissionDto assignPermissionDto = new AssignPermissionDto(roleId,checkedList);
        menuInfoService.pDelAssignPermission(roleId);
        return menuInfoService.pUpdateAssignPermission(assignPermissionDto);
    }
}
