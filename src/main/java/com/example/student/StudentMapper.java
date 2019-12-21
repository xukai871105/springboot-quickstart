package com.example.student;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

@Mapper
public interface StudentMapper {

    /**
     * 查找所有的学生
     * @return
     */
    List<StudentDO> findAllStudents();

    /**
     * 查找同学的生日
     * @param from
     * @param end
     * @return
     */
    List<StudentDO> findStudentsByBirthdayRange(@Param("from") Date from, @Param("end") Date end);
}
