package com.beic.springbootdemo2.service.impl;


import com.beic.springbootdemo2.Springbootdemo2ApplicationTests;
import com.beic.springbootdemo2.service.CourseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
class CourseServiceImplTest extends Springbootdemo2ApplicationTests {

    @Autowired
    CourseService courseService;


    @Test
    void findOne() {
        System.out.println("--------------findOne()--------------");
        System.out.println("through mybatis："+courseService.findOneThroughMybatis().toString());
        System.out.println("through jpa:"+courseService.findOneThroughJpa().toString());
    }

    @Test
    void findOneById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void addCourse() {
    }

    @Test
    void deleteById() {
    }
}