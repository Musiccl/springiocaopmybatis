package com.dzh.control;

import com.dzh.dto.UserIdArrays;
import com.dzh.pojo.UserInfo;
import com.dzh.service.UserInfoService;
import com.dzh.tool.MD5Utils;
import com.dzh.vo.TestValidationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@RestController
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;

    @RequestMapping("init")
    public Object init(UserInfo userInfo, HttpSession httpSession) {
        String md5String = MD5Utils.myEncode(userInfo.getPassword());
        userInfo.setPassword(md5String);
        UserInfo userInfos = userInfoService.userLogin(userInfo);
        if(userInfos != null) {
            httpSession.setAttribute("userInfo",userInfos);
            return true;
        }else{
            return false;
        }
    }

    @RequestMapping("listAllUserInfo")
    public Object listAllUserInfo() {
        return userInfoService.listAllUserInfo();
    }

    @RequestMapping("getUserInfoById")
    public Object getUserInfoById(@RequestParam int userId) {
        return userInfoService.getUserInfoById(userId);
    }

    @RequestMapping("upDateUserInfo")
    public Object upDateUserInfo(@RequestBody UserInfo userInfo) {
        int i = userInfoService.upDateUserInfoById(userInfo);
        if (i>0) {
            return true;
        }
        return false;
    }

    @RequestMapping("insertUserInfo")
    public Object insertUserInfo(@RequestBody UserInfo userInfo) {
        String password = MD5Utils.myEncode(userInfo.getPassword());
        userInfo.setPassword(password);
        System.out.println(userInfo);
        int i = userInfoService.insertUserInfo(userInfo);
        if (i > 0) {
            return true;
        }
        return false;
    }

    @RequestMapping("delUserInfoById")
    public Object delUserInfoById(@RequestParam int userId) {
        int i = userInfoService.delUserInfoById(userId);
        if (i>0) {
            return i;
        }
        return 0;
    }

    @RequestMapping(value = "selectUserInfoBy")
    public Object selectUserInfoBy(@RequestParam String comdition) {
        return userInfoService.selectUserInfoBy(comdition);
    }

    @RequestMapping(value = "pDelUserInfoById")
    public Object pDelUserInfoById(@RequestParam(value="checkVals", required = false, defaultValue = "") Integer[] checkVals) {
        List<Integer> list = Arrays.asList(checkVals);
        UserIdArrays userIdArrays = new UserIdArrays();
        userIdArrays.setList(list);

        int i = userInfoService.pDelUserInfoById(userIdArrays);
        if (i>0) {
            return i;
        }
        return 0;
    }

    @RequestMapping("listRoleDto")
    public Object listRoleDto(@RequestParam int userId){
        return userInfoService.listRoleDtoByUserId(userId);
    }

    @ResponseBody
    @RequestMapping(value = "doRegister", method = RequestMethod.POST)
    public Object doRegister(@Valid @RequestBody TestValidationVo user, BindingResult result, ModelMap modelMap) {
        // 如果入参有问题，返回注册页面
        if (result.hasErrors()) {
            List<FieldError> errorList = result.getFieldErrors();
            for(FieldError error : errorList){
                System.out.println(error.getField() + "*" + error.getDefaultMessage());
                modelMap.put("ERR_" + error.getField(), error.getDefaultMessage());
            }
            return modelMap.toString();
        }
        // 这里省略注册代码...
        return "register_success";
    }

}
