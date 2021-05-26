package com.mytest.controller;

import com.mytest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:MyController
 * Package: com.mytest.controller
 * Description:
 *
 * @Date: 2021/5/25 17:37
 * @Author: 惜名
 */
@Controller
public class MyController {
    @Autowired
    private StudentService studentService;
    @RequestMapping(value = "/select")
    public ModelAndView dosome( String name,String age, Integer pageSize,Integer pageNo){

        Map<String,Object> map = new HashMap<>();
        map.put("name",name);
        map.put("age",age);
        map.put("pageSize",pageSize);
        map.put("startIndex",(pageNo-1)*pageSize);
        Map<String,Object>  rmap=studentService.selectAll(map);

        System.out.println(rmap.get("total"));
        System.out.println(rmap.get("dataList").toString());
        ModelAndView mv = new ModelAndView();
        mv.addObject("result",rmap);
        mv.setViewName("result");
        return mv;
    }
}
