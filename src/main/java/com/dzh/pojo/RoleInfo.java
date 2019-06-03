package com.dzh.pojo;

public class RoleInfo {

    int roleId;
    String roleName;
    String shortName;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public RoleInfo() {
    }

    public RoleInfo(int roleId, String roleName, String shortName) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.shortName = shortName;
    }

    @Override
    public String toString() {
        return "RoleInfo{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", shortName='" + shortName + '\'' +
                '}';
    }
}
