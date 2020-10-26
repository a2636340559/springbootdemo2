package com.beic.springbootdemo2.mapper;

import com.beic.springbootdemo2.pojo.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CourseMapper {
    /*
     *随机获取一条数据
     * @return
     */
    @Select(value = "select * from course order by rand() limit 1;")
    Course findOne();

     /**
      * 通过id获取一条数据
      * @param id
      * @return
      */
     @Select(value = "select * from course where id = ?")
    Course findOneById(Long id);

     /**
      * 查询所有数据
      * @return
      */
     @Select(value = "select * from course ")
    List<Course> findAll();

    /**
     * 增加课程
     * @param course
     * @return
     */
//    int addCourse(Course course);

    /**
     * 通过id删除
     * @param id
     * @return
     */
    //int deleteById(Long id);
}
