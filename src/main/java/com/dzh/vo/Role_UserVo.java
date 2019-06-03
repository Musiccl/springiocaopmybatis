package com.dzh.vo;

import java.util.List;

public class Role_UserVo {
    int userId;
    List<Integer> roleId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<Integer> getRoleId() {
        return roleId;
    }

    public void setRoleId(List<Integer> roleId) {
        this.roleId = roleId;
    }

    public Role_UserVo() {
    }

    public Role_UserVo(int userId, List<Integer> roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "Role_UserVo{" +
                "userId=" + userId +
                ", roleId=" + roleId +
                '}';
    }
}
