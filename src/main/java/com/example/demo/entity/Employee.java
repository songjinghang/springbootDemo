package com.example.demo.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`tab_employee`")
public class Employee {
    @Id
    @Column(name = "`employee_id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;

    @Column(name = "`employee_name`")
    private String employeeName;

    @Column(name = "`phone`")
    private String phone;

    @Column(name = "`birthday`")
    private Date birthday;

    @Column(name = "`age`")
    private Integer age;

    @Column(name = "`department_id`")
    private Integer departmentId;

    /**
     * @return employee_id
     */
    public Integer getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId
     */
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return employee_name
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * @param employeeName
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * @return birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return department_id
     */
    public Integer getDepartmentId() {
        return departmentId;
    }

    /**
     * @param departmentId
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday=" + birthday +
                ", age=" + age +
                ", departmentId=" + departmentId +
                '}';
    }
}