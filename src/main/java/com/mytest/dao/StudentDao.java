package com.mytest.dao;

import com.mytest.beans.Student;

import java.util.List;
import java.util.Map;

/**
 * ClassName:StudentDao
 * Package: com.mytest.dao
 * Description:
 *
 * @Date: 2021/5/25 17:08
 * @Author: 惜名
 */
public interface StudentDao {
    Long getTotal(Map<String, Object> map);

   List<Student> getDataList(Map<String, Object> map);
}
