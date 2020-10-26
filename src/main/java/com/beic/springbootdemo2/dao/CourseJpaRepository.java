package com.beic.springbootdemo2.dao;

import com.beic.springbootdemo2.pojo.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseJpaRepository extends JpaRepository<Course,Long> {

    /**
     * 随机获取一条数据
     * @return
     */
    @Query(value = "select * from course order by rand() limit 1",nativeQuery = true)
    Course findOne();
}
