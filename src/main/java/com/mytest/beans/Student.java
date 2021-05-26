package com.mytest.beans;

/**
 * ClassName:Student
 * Package: com.mytest.beans
 * Description:
 *
 * @Date: 2021/5/25 20:48
 * @Author: 惜名
 */
public class Student {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
