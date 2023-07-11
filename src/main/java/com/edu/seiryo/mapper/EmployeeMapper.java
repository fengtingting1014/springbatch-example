package com.edu.seiryo.mapper;

import com.edu.seiryo.domain.Employee;

public interface EmployeeMapper {
    /**
     * 保存
     * @param employee
     * @return
     */
    public int save(Employee employee);
    /**
     * 添加临时表
     * @param employee
     * @return
     */
    public int saveTemp(Employee employee);

    /**
     * 清空数据
     */
    public void truncateAll();

    /**
     * 清空临时表数据
     */
    public void truncateTemp();
}
