package com.beic.springbootdemo2.service;

import com.beic.springbootdemo2.common.CommonResult;
import com.beic.springbootdemo2.pojo.Course;


public interface CourseService {
    CommonResult findOneThroughMybatis();
    CommonResult findOneThroughJpa();

    CommonResult findOneByIdThroughMybatis(Long id);
    CommonResult findOneByIdThroughJpa(Long id);

    CommonResult findAllThroughMybatis();
    CommonResult findAllThroughJpa();

//    int addCourse(Course course);
//
//    int deleteById(Long id);

}
