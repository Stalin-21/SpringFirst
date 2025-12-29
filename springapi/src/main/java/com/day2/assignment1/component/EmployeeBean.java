package com.day2.assignment1.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

    private final DepartmentBean departmentBean;

    @Autowired
    public EmployeeBean(DepartmentBean departmentBean) {
        this.departmentBean = departmentBean;
    }

    public void showEmployeeDetails() {
        System.out.println("Employee belongs to department: "
                + departmentBean.getDepartmentName());
    }
}