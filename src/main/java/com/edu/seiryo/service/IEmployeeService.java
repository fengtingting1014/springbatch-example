package com.edu.seiryo.service;

import com.edu.seiryo.domain.Employee;

import java.io.IOException;

/**
 * service接口
 */
public interface IEmployeeService {
    /**
     * 保存
     * @param employee
     */
    void save(Employee employee);

    /**
     * 初始化数据
     * @throws IOException
     */
    void dataInit() throws IOException;

    /**
     * 清空数据
     */
    void truncateAll();

    /**
     * 清空employee_temp数据
     */
    void truncateTemp();
}
