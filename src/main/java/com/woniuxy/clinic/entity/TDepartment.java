package com.woniuxy.clinic.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TDepartment {
    private Integer departmentId;

    private String departmentName;

    private String departmentDescribe;

    private Date departmentCreationtime;

    private String departmentStatus;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public String getDepartmentDescribe() {
        return departmentDescribe;
    }

    public void setDepartmentDescribe(String departmentDescribe) {
        this.departmentDescribe = departmentDescribe == null ? null : departmentDescribe.trim();
    }

    public Date getDepartmentCreationtime() {
        return departmentCreationtime;
    }

    public void setDepartmentCreationtime(Date departmentCreationtime) {
        this.departmentCreationtime = departmentCreationtime;
    }

    public String getDepartmentStatus() {
        return departmentStatus;
    }

    public void setDepartmentStatus(String departmentStatus) {
        this.departmentStatus = departmentStatus == null ? null : departmentStatus.trim();
    }
}