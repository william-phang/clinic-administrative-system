
package com.woniuxy.clinic.entity;

import java.util.Date;

import org.springframework.context.annotation.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TStaff {
    private Integer staffId;

    private String staffName;

    private String staffSex;

    private Integer staffAge;

    private String staffPhone;

    private String staffCard;

    private Date staffTime;

    private Integer departmentId;

    private Integer roleId;

    private String staffStatus;
    
    private TDepartment tDepartment;
    
    private TRole tRole;

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex == null ? null : staffSex.trim();
    }

    public Integer getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(Integer staffAge) {
        this.staffAge = staffAge;
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone == null ? null : staffPhone.trim();
    }

    public String getStaffCard() {
        return staffCard;
    }

    public void setStaffCard(String staffCard) {
        this.staffCard = staffCard == null ? null : staffCard.trim();
    }

    public Date getStaffTime() {
        return staffTime;
    }

    public void setStaffTime(Date staffTime) {
        this.staffTime = staffTime;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getStaffStatus() {
        return staffStatus;
    }

    public void setStaffStatus(String staffStatus) {
        this.staffStatus = staffStatus == null ? null : staffStatus.trim();
    }
}