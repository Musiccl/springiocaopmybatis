package com.dzh;

import com.dzh.control.MenuInfoController;
import com.dzh.dto.MenuInfoDto;
import com.dzh.dto.RoleDto;
import com.dzh.dto.UserIdArrays;
import com.dzh.pojo.GoodsInfo;
import com.dzh.pojo.RoleInfo;
import com.dzh.pojo.UserInfo;
import com.dzh.service.GoodsInfoService;
import com.dzh.service.MenuInfoService;
import com.dzh.service.RoleInfoService;
import com.dzh.service.UserInfoService;
import com.dzh.vo.RoleInfoVo;
import com.dzh.vo.Role_UserVo;
import com.dzh.vo.SelectComditionVo;
import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class main {

    ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml","spring-service.xml");
    UserInfoService userInfoService = context.getBean(UserInfoService.class);
    RoleInfoService roleInfoService = context.getBean(RoleInfoService.class);
    MenuInfoService menuInfoService = context.getBean(MenuInfoService.class);
    GoodsInfoService goodsInfoService = context.getBean(GoodsInfoService.class);

    @Test
    public void test() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("123");
        userInfo.setPassword("123");
        UserInfo userInfoList = userInfoService.userLogin(userInfo);
        System.out.println(userInfoList);
    }

    @Test
    public void test1() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(4);
        userInfo.setUserName("马学府是沙雕");
        userInfo.setPassword("3838438");
        int i = userInfoService.upDateUserInfoById(userInfo);
        System.out.println(i);
    }

    @Test
    public void test2() {
        List<UserInfo> userInfoList = userInfoService.listAllUserInfo();

        for (UserInfo userInfo : userInfoList) {
            System.out.println(userInfo);
        }
    }

    @Test
    public void test3() {
        UserInfo userInfo = userInfoService.getUserInfoById(2);

            System.out.println(userInfo);

    }

    @Test
    public void test4() {
        int i = userInfoService.delUserInfoById(2);
        System.out.println(i);
    }

    @Test
    public void test5() {
        List<UserInfo> userInfoList = userInfoService.selectUserInfoBy("1");
        for (UserInfo userInfo : userInfoList) {
            System.out.println(userInfo);
        }
    }

    @Test
    public void test6() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(7);
        list.add(9);
        UserIdArrays userIdArrays = new UserIdArrays();
        userIdArrays.setList(list);
        int i = userInfoService.pDelUserInfoById(userIdArrays);
        System.out.println(i);
    }

    @Test
    public void test7() {
        List<RoleInfo> allRole = roleInfoService.getAllRole();
        System.out.println(allRole);
    }

    @Test
    public void test8() {
        List<MenuInfoDto> menuInfoDtos = menuInfoService.showMenuInfo();
        System.out.println(menuInfoDtos);

    }

    @Test
    public void test9() {
        List<RoleDto> roleDtos = userInfoService.listRoleDtoByUserId(3);
        for (RoleDto roleDto : roleDtos) {
            System.out.println(roleDto);
        }

    }

    @Test
    public void test10() {
        List<MenuInfoDto> menuInfoDtos = menuInfoService.showMenuInfoByUserId(3);
        for (MenuInfoDto menuInfoDto : menuInfoDtos) {
            System.out.println(menuInfoDto);
        }

    }

    @Test
    public void test11() {
        List<RoleInfoVo> allRoleBy = roleInfoService.getAllRoleById(2);
        for (RoleInfoVo roleInfoVo : allRoleBy) {
            System.out.println(roleInfoVo);
        }
    }

    @Test
    public void test12() {
        int userid = 1;
        List<Integer> roleid = new ArrayList<Integer>();
        roleid.add(1);
        roleid.add(2);
        roleid.add(3);
        Role_UserVo role_userVo = new Role_UserVo(userid,roleid);
        int i = roleInfoService.pUpdateRoleById(role_userVo);
        System.out.println(i);
    }

    @Test
    public void test13() {
        List<MenuInfoDto> menuInfoDtos = menuInfoService.showMenuInfoByRoleId(3);
        for (MenuInfoDto m : menuInfoDtos) {
            System.out.println(m);
        }
    }

    @Test
    public void test14() {
        SelectComditionVo selectComditionVo = new SelectComditionVo();
        selectComditionVo.setGoodsName("华为");
        List<GoodsInfo> goodsInfoBy = goodsInfoService.getGoodsInfoBy(selectComditionVo);

        for (GoodsInfo goodsInfo : goodsInfoBy) {
            System.out.println(goodsInfo);
        }

    }

}
