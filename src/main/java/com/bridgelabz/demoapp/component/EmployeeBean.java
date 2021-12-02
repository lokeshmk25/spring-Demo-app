package com.bridgelabz.demoapp.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private int id;
    private String name;

    @Autowired
    private DepartmentBean deptBean;
    public static final Logger logger= LoggerFactory.getLogger(EmployeeBean.class);

    public EmployeeBean() {
    }
    @Autowired
    public EmployeeBean(DepartmentBean deptBean) {
        logger.trace("***Autowiring by using @Autowired annotation on constructor ***");
        this.deptBean = deptBean;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DepartmentBean getDeptBean() {
        return deptBean;
    }

    public void showEmployeeDetails(){
        logger.debug("Employee Id : {}",id);
        logger.debug("Employee Name : {}",name);
        deptBean.setDeptName("Information Technology");
        logger.debug("Department : {}",deptBean.getDeptName());
    }
}
