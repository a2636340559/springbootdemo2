package com.beic.springbootdemo2.service.impl;

import com.beic.springbootdemo2.common.CommonResult;
import com.beic.springbootdemo2.dao.CourseJpaRepository;
import com.beic.springbootdemo2.mapper.CourseMapper;
import com.beic.springbootdemo2.pojo.Course;
import com.beic.springbootdemo2.service.CourseService;
import org.omg.CORBA.COMM_FAILURE;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Resource
    CourseMapper courseMapper;

    @Resource
    CourseJpaRepository courseJpaRepository;

    @Override
    public CommonResult findOneThroughMybatis() {
        CommonResult commonResult = new CommonResult();
        try {
            Course course = courseMapper.findOne();
            if (course != null) {
                commonResult.setResult(course);
                commonResult.setStatus("success");
                commonResult.setMessage("find one through mybatis.");
            } else {
                commonResult.setStatus("failed");
                commonResult.setMessage("result is null");
            }
        }
        catch (Exception e)
        {
            commonResult.setMessage(e.getMessage());
        }

        return commonResult;
    }

    @Override
    public CommonResult findOneThroughJpa() {
        CommonResult commonResult = new CommonResult();
        try {
            Course course = courseJpaRepository.findOne();
            if (course != null) {
                commonResult.setResult(course);
                commonResult.setStatus("success");
                commonResult.setMessage("find one through jpa.");
            } else {
                commonResult.setStatus("failed");
                commonResult.setMessage("result is null");
            }
        }
        catch (Exception e)
        {
            commonResult.setMessage(e.getMessage());
        }

        return commonResult;
    }

    @Override
    public CommonResult findOneByIdThroughMybatis(Long id) {
        CommonResult commonResult = new CommonResult();
        try {
            Course course = courseMapper.findOneById(id);
            if (course != null) {
                commonResult.setResult(course);
                commonResult.setStatus("success");
                commonResult.setMessage("get one data by id through mybatis.");
            } else {
                commonResult.setStatus("failed");
                commonResult.setMessage("the data that id = "+id+" doesn't exist.");
            }
        }
        catch (Exception e)
        {
            commonResult.setMessage(e.getMessage());
        }

        return commonResult;
    }

    @Override
    public CommonResult findOneByIdThroughJpa(Long id) {
        CommonResult commonResult = new CommonResult();
        try {
            Course course = courseJpaRepository.getOne(id);
            if (course != null) {
                commonResult.setResult(course);
                commonResult.setStatus("success");
                commonResult.setMessage("get one data by id through jpa.");
            } else {
                commonResult.setStatus("failed");
                commonResult.setMessage("the data that id = "+id+" doesn't exist.");
            }
        }
        catch (Exception e)
        {
            commonResult.setMessage(e.getMessage());
        }

        return commonResult;
    }

    @Override
    public CommonResult findAllThroughMybatis() {
        CommonResult commonResult = new CommonResult();
        try {
            List<Course> courses = courseMapper.findAll();
            if (courses.size() > 0) {
                commonResult.setResult(courses);
                commonResult.setStatus("success");
                commonResult.setMessage("find all through mybatis.");
            } else {
                commonResult.setStatus("failed");
                commonResult.setMessage("there is no data.");
            }
        }
        catch (Exception e)
        {
            commonResult.setMessage(e.getMessage());
        }

        return commonResult;
    }

    @Override
    public CommonResult findAllThroughJpa() {
        CommonResult commonResult = new CommonResult();
        try {
            List<Course> courses = courseJpaRepository.findAll();
            if (courses.size() > 0) {
                commonResult.setResult(courses);
                commonResult.setStatus("success");
                commonResult.setMessage("find all through jpa.");
            } else {
                commonResult.setStatus("failed");
                commonResult.setMessage("there is no data.");
            }
        }
        catch (Exception e)
        {
            commonResult.setMessage(e.getMessage());
        }

        return commonResult;
    }

//    @Override
//    public int addCourse(Course course) {
//        return courseMapper.addCourse(course);
//    }
//
//    @Override
//    public int deleteById(Long id) {
//        return courseMapper.deleteById(id);
//    }
}
