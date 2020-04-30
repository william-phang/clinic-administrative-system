package com.woniuxy.clinic.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TRole {
    private Integer roleId;

    private String roleName;

    private String roleDescribe;

    private Date roleCreationtime;

    private String roleStatus;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDescribe() {
        return roleDescribe;
    }

    public void setRoleDescribe(String roleDescribe) {
        this.roleDescribe = roleDescribe == null ? null : roleDescribe.trim();
    }

    public Date getRoleCreationtime() {
        return roleCreationtime;
    }

    public void setRoleCreationtime(Date roleCreationtime) {
        this.roleCreationtime = roleCreationtime;
    }

    public String getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(String roleStatus) {
        this.roleStatus = roleStatus == null ? null : roleStatus.trim();
    }
}