package com.dzh.dto;

import java.util.List;

public class AssignPermissionDto {

    private int roleId;
    private List<Integer> menuIdList;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public List<Integer> getMenuIdList() {
        return menuIdList;
    }

    public void setMenuIdList(List<Integer> menuIdList) {
        this.menuIdList = menuIdList;
    }

    public AssignPermissionDto() {
    }

    public AssignPermissionDto(int roleId, List<Integer> menuIdList) {
        this.roleId = roleId;
        this.menuIdList = menuIdList;
    }

    @Override
    public String toString() {
        return "AssignPermissionDto{" +
                "roleId=" + roleId +
                ", menuIdList=" + menuIdList +
                '}';
    }
}
