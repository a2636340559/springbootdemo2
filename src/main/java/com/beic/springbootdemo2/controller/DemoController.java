package com.beic.springbootdemo2.controller;

import com.beic.springbootdemo2.common.CommonResult;
import com.beic.springbootdemo2.pojo.Course;
import com.beic.springbootdemo2.service.impl.CourseServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/demo/api/v1")
public class DemoController {

    private static final Logger logger= LoggerFactory.getLogger(DemoController.class);
    @Resource
    CourseServiceImpl courseServiceImpl;

    @RequestMapping("/course/list/{way}")
    public CommonResult index(@PathVariable("way")String way)
    {
        if(way.equals("mybatis"))
            return courseServiceImpl.findAllThroughMybatis();
        if(way.equals("jpa"))
            return courseServiceImpl.findAllThroughJpa();
        return new CommonResult("路径参数错误,/course/list/{way},way[mybatis|jpa].");
    }


    @RequestMapping("/course/getone/{way}")
    public CommonResult getOne(@PathVariable("way")String way)
    {

        if(way.equals("mybatis"))
            return courseServiceImpl.findOneThroughMybatis();
        if(way.equals("jpa"))
            return courseServiceImpl.findOneThroughJpa();
        return new CommonResult("路径参数错误,/course/getone/{way},way[mybatis|jpa].");
    }
}
