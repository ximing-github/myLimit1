package com.mytest.service.serviceImpl;

import com.mytest.dao.StudentDao;
import com.mytest.service.StudentService;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:StudentServiceImpl
 * Package: com.mytest.service.serviceImpl
 * Description:
 *
 * @Date: 2021/5/25 17:15
 * @Author: 惜名
 */
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public Map<String, Object> selectAll(Map<String, Object> map) {
        Map<String,Object> rmap = new HashMap<>();
        rmap.put("total",studentDao.getTotal(map));
        rmap.put("dataList",studentDao.getDataList(map));
        return rmap;
    }
}
